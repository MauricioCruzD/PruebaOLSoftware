Prueba Tecnica OLSoftware Java


INSERTS INCIALES EN ROLES Y USERS

INSERT INTO `role` (`id`, `name`) VALUES
(6, 'ROLE_ADMIN'),
(8, 'ROLE_SUPER');

INSERT INTO `users` (`id`, `username`, `password`, `first_name`, `last_name`, `email`, `phone`, `area_id`, `role`) VALUES
(6, 'Mauricio', '$2a$10$hCSHXvp.WiD9Nb6.ym0oROCjcyIhmJO1ehhjyKu/9.aMOwVkaljPa', NULL, NULL, 'macrudi@gmail.com', NULL, NULL, 6),
(8, 'MauricioCD', '$2a$10$tizllq2TrI607K/6EQWl4OrjBqtCgZPbKTIyErvkTeCrvnVWjRGXS', NULL, NULL, 'macrudi1@gmail.com', NULL, NULL, 8);


JSON para obtener JWT
ROLE_ADMIN
{
    "username":"Mauricio",
    "email":"macrudi@gmail.com",
    "password":"123456"
}

ROLE_SUPER
{
    "username":"MauricioCD",
    "email":"macrudi@gmail.com",
    "password":"123456"
}
