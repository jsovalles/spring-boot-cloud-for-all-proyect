/* Tabla productos */
INSERT INTO productos (nombre, precio, created_at) VALUES('iPhone 11 64GB', 3522900, NOW());
INSERT INTO productos (nombre, precio, created_at) VALUES('Xiaomi Redmi Note 8 64GB', 699900, NOW());
INSERT INTO productos (nombre, precio, created_at) VALUES('Samsung Galaxy S20 Plus', 4296950, NOW());
INSERT INTO productos (nombre, precio, created_at) VALUES('Huawei Y9 Prime 2019', 692900, NOW());
INSERT INTO productos (nombre, precio, created_at) VALUES('Motorola Moto G8 Play', 561900, NOW());
/* Tabla facturas */
INSERT INTO facturas (descripcion, observacion, created_at) VALUES('Primera factura universal', 'Mocked', NOW());
/* Tabla detalle_facturas */
INSERT INTO detalle_facturas (cantidad, factura_id, producto_id, lugar_despacho) VALUES(1, 1, 1,'Bogotá');
INSERT INTO detalle_facturas (cantidad, factura_id, producto_id, lugar_despacho) VALUES(3, 1, 3,'Bogotá');