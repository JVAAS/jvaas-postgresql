
INSERT INTO listing (id, created, modified) VALUES (?, now(), now());

UPDATE listing SET modified = now() WHERE id = ?;
UPDATE listing SET modified = now(), title = ?, title_url = ? WHERE id = ?;
UPDATE listing SET modified = now(), description = ? WHERE id = ?;
UPDATE listing SET modified = now(), country = ?, country_url = ? WHERE id = ?;
UPDATE listing SET modified = now(), province = ?, province_url = ? WHERE id = ?;
UPDATE listing SET modified = now(), city = ?, city_url = ? WHERE id = ?;
UPDATE listing SET modified = now(), suburb = ?, suburb_url = ? WHERE id = ?;
UPDATE listing SET modified = now(), sale = ? WHERE id = ?;
UPDATE listing SET modified = now(), rental = ? WHERE id = ?;
UPDATE listing SET modified = now(), sale_price = ? WHERE id = ?;
UPDATE listing SET modified = now(), rental_price = ? WHERE id = ?;
UPDATE listing SET modified = now(), bedrooms = ? WHERE id = ?;
UPDATE listing SET modified = now(), bathrooms = ? WHERE id = ?;
UPDATE listing SET modified = now(), garages = ? WHERE id = ?;
UPDATE listing SET modified = now(), parkings = ? WHERE id = ?;
UPDATE listing SET modified = now(), floor_size = ? WHERE id = ?;
UPDATE listing SET modified = now(), erf_size = ? WHERE id = ?;
UPDATE listing SET modified = now(), rates_and_taxes = ? WHERE id = ?;
UPDATE listing SET modified = now(), published = ? WHERE id = ?;
UPDATE listing SET modified = now(), section = ? WHERE id = ?;

SELECT id FROM listing WHERE id = 1;
