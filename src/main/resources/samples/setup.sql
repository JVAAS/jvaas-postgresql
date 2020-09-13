--
-- Name: account; Type: TABLE; Schema: public; Owner: vlad
--

CREATE TABLE account
(
    id           uuid                                      NOT NULL,
    created      timestamp without time zone DEFAULT now() NOT NULL,
    modified     timestamp without time zone DEFAULT now() NOT NULL,
    version      integer                     DEFAULT 0     NOT NULL,
    display_name character varying,
    email        character varying                         NOT NULL,
    enabled      boolean                     DEFAULT false NOT NULL,
    full_name    character varying,
    hash         character varying,
    verified     boolean                     DEFAULT false NOT NULL,
    verify_hash  character varying,
    reset_hash   character varying,
    phone        character varying
);



--
-- Name: listing; Type: TABLE; Schema: public; Owner: vlad
--

CREATE TABLE listing
(
    id              uuid                                      NOT NULL,
    created         timestamp without time zone DEFAULT now(),
    modified        timestamp without time zone DEFAULT now(),
    version         integer                     DEFAULT 0,
    title           character varying,
    description     text,
    country         character varying,
    province        character varying,
    city            character varying,
    suburb          character varying,
    country_url     character varying,
    province_url    character varying,
    city_url        character varying,
    suburb_url      character varying,
    sale            boolean                     DEFAULT false NOT NULL,
    rental          boolean                     DEFAULT false NOT NULL,
    sale_price      integer,
    rental_price    integer,
    title_url       character varying,
    bedrooms        integer,
    bathrooms       integer,
    garages         integer,
    parkings        integer,
    floor_size      bigint,
    erf_size        bigint,
    rates_and_taxes bigint,
    levies          integer,
    published       boolean                     DEFAULT false NOT NULL,
    section         character varying           DEFAULT 'basic'::character varying
);



--
-- Name: listing_image; Type: TABLE; Schema: public; Owner: vlad
--

CREATE TABLE listing_image
(
    id         uuid              NOT NULL,
    listing_id uuid              NOT NULL,
    width      integer DEFAULT 0,
    height     integer DEFAULT 0,
    name       character varying NOT NULL,
    batch      uuid              NOT NULL
);



--
-- Name: session; Type: TABLE; Schema: public; Owner: vlad
--

CREATE TABLE session
(
    created    timestamp without time zone DEFAULT now() NOT NULL,
    modified   timestamp without time zone DEFAULT now() NOT NULL,
    version    integer                     DEFAULT 0     NOT NULL,
    token      character varying,
    account_id uuid                                      NOT NULL,
    email      character varying,
    active     boolean                     DEFAULT false NOT NULL
);



--
-- Name: account account_pk; Type: CONSTRAINT; Schema: public; Owner: vlad
--

ALTER TABLE ONLY account
    ADD CONSTRAINT account_pk PRIMARY KEY (id);


--
-- Name: listing_image listing_image_pk; Type: CONSTRAINT; Schema: public; Owner: vlad
--

ALTER TABLE ONLY listing_image
    ADD CONSTRAINT listing_image_pk PRIMARY KEY (id);


--
-- Name: listing listing_pk; Type: CONSTRAINT; Schema: public; Owner: vlad
--

ALTER TABLE ONLY listing
    ADD CONSTRAINT listing_pk PRIMARY KEY (id);


--
-- Name: account_email_uindex; Type: INDEX; Schema: public; Owner: vlad
--

CREATE UNIQUE INDEX account_email_uindex ON account USING btree (email);


--
-- Name: session_account_id_uindex; Type: INDEX; Schema: public; Owner: vlad
--

CREATE UNIQUE INDEX session_account_id_uindex ON session USING btree (account_id);


--
-- Name: session_email_index; Type: INDEX; Schema: public; Owner: vlad
--

CREATE INDEX session_email_index ON session USING btree (email);


--
-- PostgreSQL database dump complete
--
