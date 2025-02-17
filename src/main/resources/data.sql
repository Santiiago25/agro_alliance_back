use agro_alliance;

-- Insertar datos en la tabla "finca"
INSERT INTO finca (nombre_finca, ubicacion, propietario) VALUES
('Finca Los Pinos', 'Zona Norte, Colombia', 'Carlos Ruiz'),
('Finca El Eden', 'Zona Sur, Colombia', 'Juan Pérez'),
('Finca La Esperanza', 'Zona Este, Colombia', 'María López'),
('Finca San Rafael', 'Zona Oeste, Colombia', 'Luis Martínez'),
('Finca Las Lomas', 'Zona Centro, Colombia', 'Ana Gómez'),
('Finca El Bosque', 'Zona Norte, Colombia', 'Ricardo Díaz'),
('Finca Valle Verde', 'Zona Sur, Colombia', 'Carlos Ruiz'),
('Finca El Refugio', 'Zona Este, Colombia', 'Marta González'),
('Finca Los Alamos', 'Zona Oeste, Colombia', 'Raúl Herrera'),
('Finca La Montaña', 'Zona Norte, Colombia', 'Gabriel Vargas');

-- Insertar datos en la tabla "actividad_agronomica"
INSERT INTO actividad_agronomica (fecha, tipo_actividad, insumos_utilizados, duracion) VALUES
('2025-01-10', 'Siembra', 'Fertilizante, Semillas', '5 horas'),
('2025-01-12', 'Riego', 'Agua', '3 horas'),
('2025-01-15', 'Fertilización', 'Fertilizante', '4 horas'),
('2025-01-20', 'Corte', 'Tijeras, Tractor', '6 horas'),
('2025-01-25', 'Plaguicida', 'Plaguicida', '2 horas'),
('2025-02-01', 'Siembra', 'Fertilizante, Semillas', '5 horas'),
('2025-02-05', 'Riego', 'Agua', '3 horas'),
('2025-02-10', 'Fertilización', 'Fertilizante', '4 horas'),
('2025-02-12', 'Corte', 'Tijeras, Tractor', '6 horas'),
('2025-02-15', 'Plaguicida', 'Plaguicida', '2 horas');

-- Insertar datos en la tabla "insumo"
INSERT INTO insumo (nombre_insumo, tipo_insumo, descripcion, id_actividad_agronomica) VALUES
('Fertilizante', 'Químico', 'Fertilizante nitrogenado', '1'),
('Semillas', 'Biológico', 'Semillas de maíz', '1'),
('Agua', 'Natural', 'Agua para riego', '2'),
('Fertilizante', 'Químico', 'Fertilizante fosforado', '3'),
('Tijeras', 'Herramienta', 'Tijeras para corte', '4'),
('Tractor', 'Maquinaria', 'Tractor para corte', '4'),
('Plaguicida', 'Químico', 'Plaguicida para control de plagas', '5'),
('Fertilizante', 'Químico', 'Fertilizante nitrogenado', '6'),
('Semillas', 'Biológico', 'Semillas de arroz', '6'),
('Agua', 'Natural', 'Agua para riego', '7'),
('Fertilizante', 'Químico', 'Fertilizante fosforado', '8'),
('Tijeras', 'Herramienta', 'Tijeras para corte', '9'),
('Tractor', 'Maquinaria', 'Tractor para corte', '9'),
('Plaguicida', 'Químico', 'Plaguicida para control de plagas', '10'),
('Fertilizante', 'Químico', 'Fertilizante nitrogenado', '11'),
('Semillas', 'Biológico', 'Semillas de maíz', '12'),
('Agua', 'Natural', 'Agua para riego', '13'),
('Fertilizante', 'Químico', 'Fertilizante fosforado', '14'),
('Tijeras', 'Herramienta', 'Tijeras para corte', '15'),
('Tractor', 'Maquinaria', 'Tractor para corte', '16');

-- Insertar datos en la tabla "parcela"
INSERT INTO parcela (latitud, longitud, tamano, tipo_cultivo) VALUES
('4.653', '-74.134', '10 hectáreas', 'Maíz'),
('4.654', '-74.136', '12 hectáreas', 'Arroz'),
('4.655', '-74.138', '15 hectáreas', 'Frijoles'),
('4.656', '-74.140', '8 hectáreas', 'Soja'),
('4.657', '-74.142', '20 hectáreas', 'Café'),
('4.658', '-74.144', '18 hectáreas', 'Tomates'),
('4.659', '-74.146', '25 hectáreas', 'Papa'),
('4.660', '-74.148', '30 hectáreas', 'Plátano'),
('4.661', '-74.150', '22 hectáreas', 'Caña de azúcar'),
('4.662', '-74.152', '10 hectáreas', 'Maíz'),
('4.663', '-74.154', '12 hectáreas', 'Arroz'),
('4.664', '-74.156', '15 hectáreas', 'Frijoles'),
('4.665', '-74.158', '8 hectáreas', 'Soja'),
('4.666', '-74.160', '20 hectáreas', 'Café'),
('4.667', '-74.162', '18 hectáreas', 'Tomates'),
('4.668', '-74.164', '25 hectáreas', 'Papa'),
('4.669', '-74.166', '30 hectáreas', 'Plátano'),
('4.670', '-74.168', '22 hectáreas', 'Caña de azúcar'),
('4.671', '-74.170', '10 hectáreas', 'Maíz'),
('4.672', '-74.172', '12 hectáreas', 'Arroz');

-- Insertar datos en la tabla "uso_insumo"
INSERT INTO uso_insumo (cantidad) VALUES
('50 kg'),
('100 kg'),
('200 kg'),
('300 kg'),
('400 kg'),
('500 kg'),
('600 kg'),
('700 kg'),
('800 kg'),
('900 kg'),
('1000 kg'),
('1100 kg'),
('1200 kg'),
('1300 kg'),
('1400 kg'),
('1500 kg'),
('1600 kg'),
('1700 kg'),
('1800 kg'),
('1900 kg'),
('2000 kg'),
('2100 kg'),
('2200 kg'),
('2300 kg'),
('2400 kg'),
('2500 kg'),
('2600 kg'),
('2700 kg'),
('2800 kg'),
('2900 kg'),
('3000 kg'),
('3100 kg'),
('3200 kg'),
('3300 kg'),
('3400 kg'),
('3500 kg'),
('3600 kg'),
('3700 kg'),
('3800 kg'),
('3900 kg'),
('4000 kg'),
('4100 kg'),
('4200 kg'),
('4300 kg'),
('4400 kg'),
('4500 kg'),
('4600 kg'),
('4700 kg'),
('4800 kg'),
('4900 kg'),
('5000 kg');