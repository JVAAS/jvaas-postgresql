
-- fun selectTest
--SELECT 'account' AS name;

-- fun insertListingId
INSERT INTO listing (id, created, modified) VALUES (?, now(), now());

-- fun demoQuery
UPDATE listing SET modified = now(), title_url = ?
WHERE id = ? AND version = ? AND title    LIKE       ? OR bedrooms > 0;

-- fun updateModified
UPDATE listing SET modified = now() WHERE id = ?;
-- fun updateTitle
UPDATE listing SET modified = now(), title = ?, title_url = ? WHERE id = ?;
-- fun updateDescription
UPDATE listing SET modified = now(), description = ? WHERE id = ?;
-- fun updateCounty
UPDATE listing SET modified = now(), country = ?, country_url = ? WHERE id = ?;
-- fun updateProvince
UPDATE listing SET modified = now(), province = ?, province_url = ? WHERE id = ?;
-- fun updateCity
UPDATE listing SET modified = now(), city = ?, city_url = ? WHERE id = ?;
-- fun updateSuburb
UPDATE listing SET modified = now(), suburb = ?, suburb_url = ? WHERE id = ?;
-- fun updateSale
UPDATE listing SET modified = now(), sale = ? WHERE id = ?;
-- fun updateRental
UPDATE listing SET modified = now(), rental = ? WHERE id = ?;
-- fun updateSalePrice
UPDATE listing SET modified = now(), sale_price = ? WHERE id = ?;
-- fun updateRentalPrice
UPDATE listing SET modified = now(), rental_price = ? WHERE id = ?;
-- fun updateBedroomsCount
UPDATE listing SET modified = now(), bedrooms = ? WHERE id = ?;
-- fun updateBathroomsCount
UPDATE listing SET modified = now(), bathrooms = ? WHERE id = ?;
-- fun updateGaragesCount
UPDATE listing SET modified = now(), garages = ? WHERE id = ?;
-- fun updateParkingsCount
UPDATE listing SET modified = now(), parkings = ? WHERE id = ?;
-- fun updateFloorSize
UPDATE listing SET modified = now(), floor_size = ? WHERE id = ?;
-- fun updateErfSize
UPDATE listing SET modified = now(), erf_size = ? WHERE id = ?;
-- fun updateRatesAndTaxes
UPDATE listing SET modified = now(), rates_and_taxes = ? WHERE id = ?;
-- fun updatePublished
UPDATE listing SET modified = now(), published = ? WHERE id = ?;
-- fun updateSection
UPDATE listing SET modified = now(), section = ? WHERE id = ?;

-- fun selectAllWhereIdIs1
SELECT l.id, title FROM listing AS l WHERE l.id = ?;

-- fun complexSelectWithJoin
SELECT
    l.id, l.title, l.title_url, li.id, li.width, li.height, li.name, l.published,
    l.parkings, l.erf_size, l.sale_price, l.created, l.modified, l.version
FROM listing AS l
LEFT JOIN listing_image AS li ON l.id = li.listing_id
LEFT JOIN account AS a ON a.id = l.id
WHERE l.id = ? AND l.created < now() AND li.width > ? AND li.height > ?;

-- fun updateSession
UPDATE session SET active = ?, version = version + 1, modified = now() WHERE email = ?;

-- fun createSession
INSERT INTO session (
    created, modified, version, token, account_id, email, active
) VALUES (
    now(), now(), 0, ?, ?, ?, true
) ON CONFLICT (account_id) DO UPDATE SET
    modified = now(),
    version  = session.version + 1,
    token    = ?,
    active   = true
WHERE version = ?