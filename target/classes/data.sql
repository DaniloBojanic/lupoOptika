INSERT INTO user (first_name, last_name, email, password, user_role, username) VALUES ("Danilo", "Bojanic", "danilobojanic1@gmail.com", "$2a$10$EZdoJ7zlq9TO0JjvzWMfM.R.F5gohuybg583adbGIkTcQjiupaqaa", "ADMIN", "danilo");

INSERT INTO product (on_sale, is_new, discount_percentage, price_before, price_after, name, description, price, product_gender, user_id) VALUES
  (true, false, 10, 90, 81, 'Proizvod 1', 'Opis proizvoda 1', 81, 'Muški', 1),
  (false, true, 0, 0, 0, 'Proizvod 2', 'Opis proizvoda 2', 100, 'Ženski', 1),
  (true, false, 20, 80, 64, 'Proizvod 3', 'Opis proizvoda 3', 64, 'Unisex', 1),
  (false, false, 0, 0, 0, 'Proizvod 4', 'Opis proizvoda 4', 50, 'Muški', 1),
  (true, true, 15, 85, 72.25, 'Proizvod 5', 'Opis proizvoda 5', 72.25, 'Ženski', 1);
