
-- name=insertIdIntoListing
INSERT INTO listing (id) VALUES (1);

SELECT id FROM listing WHERE id = 1;

UPDATE listing SET modified = now() WHERE id = 1;
UPDATE listing SET title = '', title_url = '' WHERE id = 1;
UPDATE listing SET description = '' WHERE id = 1;
UPDATE listing SET country = '', country_url = '' WHERE id = 1;
UPDATE listing SET province = '', province_url = '' WHERE id = 1;
UPDATE listing SET city = '', city_url = '' WHERE id = 1;
UPDATE listing SET suburb = '', suburb_url = '' WHERE id = 1;
UPDATE listing SET sale = true WHERE id = 1;
UPDATE listing SET rental = true WHERE id = 1;
UPDATE listing SET sale_price = 1 WHERE id = 1;
UPDATE listing SET rental_price = 1 WHERE id = 1;
UPDATE listing SET bedrooms = 1 WHERE id = 1;
UPDATE listing SET bathrooms = 1 WHERE id = 1;
UPDATE listing SET garages = 1 WHERE id = 1;
UPDATE listing SET parkings = 1 WHERE id = 1;
UPDATE listing SET floor_size = 1 WHERE id = 1;
UPDATE listing SET erf_size = 1 WHERE id = 1;
UPDATE listing SET rates_and_taxes = 1 WHERE id = 1;
UPDATE listing SET published = true WHERE id = 1;
UPDATE listing SET section = '' WHERE id = 1;
