/* Tabla productos */
INSERT INTO productos (id, nombre, precio, created_at) VALUES(1, 'iPhone 11 64GB', 3522900, NOW());
INSERT INTO productos (id, nombre, precio, created_at) VALUES(2, 'Xiaomi Redmi Note 8 64GB', 699900, NOW());
INSERT INTO productos (id, nombre, precio, created_at) VALUES(3, 'Samsung Galaxy S20 Plus', 4296950, NOW());
INSERT INTO productos (id, nombre, precio, created_at) VALUES(4, 'Huawei Y9 Prime 2019', 692900, NOW());
INSERT INTO productos (id, nombre, precio, created_at) VALUES(5, 'Motorola Moto G8 Play', 561900, NOW());
/* Tabla facturas */
INSERT INTO facturas (id, descripcion, observacion, created_at) VALUES(1, 'Primera factura universal', 'Mocked', NOW());
/* Tabla detalle_facturas */
INSERT INTO detalle_facturas (id, cantidad, factura_id, producto_id, lugar_despacho) VALUES(1, 1, 1, 1,'Bogotá');
INSERT INTO detalle_facturas (id, cantidad, factura_id, producto_id, lugar_despacho) VALUES(2, 3, 1, 3,'Bogotá');