CREATE DATABASE randradmin
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

COMMENT ON DATABASE randradmin
    IS 'for R and R project';
    

CREATE SEQUENCE IF NOT EXISTS registration_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE public.registration_seq
    OWNER TO postgres;

COMMENT ON SEQUENCE public.registration_seq
    IS 'for registration table';
    
 -- Table: public.registration

-- DROP TABLE IF EXISTS public.registration;

CREATE TABLE IF NOT EXISTS public.registration
(
    id integer NOT NULL DEFAULT nextval('registration_seq'::regclass),
    orgname text COLLATE pg_catalog."default" NOT NULL,
    orgaddress text COLLATE pg_catalog."default" NOT NULL,
    orgcity text COLLATE pg_catalog."default" NOT NULL,
    orgstate text COLLATE pg_catalog."default" NOT NULL,
    orgpin text COLLATE pg_catalog."default" NOT NULL,
    contactperson text COLLATE pg_catalog."default" NOT NULL,
    contactemail text COLLATE pg_catalog."default" NOT NULL,
    contactphone text COLLATE pg_catalog."default" NOT NULL,
    empcount text COLLATE pg_catalog."default" NOT NULL,
    orgindustry text COLLATE pg_catalog."default" NOT NULL,
    currentstatus text COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT registration_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.registration
    OWNER to postgres;