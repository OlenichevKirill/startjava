CREATE TABLE Jaegers(
	id SERIAL PRIMARY KEY,
	modelName TEXT,
	mark TEXT,
	height NUMERIC(9,2),
	weight NUMERIC(9,3),
	status TEXT,
	origin TEXT,
	launch DATE,
	kaijuKill INTEGER);