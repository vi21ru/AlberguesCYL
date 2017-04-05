-- Table: albergues_schema."Albergues"

-- DROP TABLE albergues_schema."Albergues";

CREATE TABLE albergues_schema."Albergues"
(
  id integer NOT NULL,
  tipo text,
  nombre text,
  direccion text,
  cpostal integer,
  provincia text,
  municipio text,
  localidad text,
  nucleo text,
  telefono1 text,
  telefono2 text,
  telefono3 text,
  fax text,
  email text,
  web text,
  qcalidad text,
  centralreservas text,
  CONSTRAINT "Albergues_pkey" PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE albergues_schema."Albergues"
  OWNER TO postgres;
