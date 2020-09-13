
-- fun=insertListing
INSERT INTO listing (id, created, modified) VALUES (?, now(), now());

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

SELECT id FROM listing WHERE id = 1;
