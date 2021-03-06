PGDMP                 
        w            fenix    12.0    12.0                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    24602    fenix    DATABASE     �   CREATE DATABASE fenix WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Colombia.1252' LC_CTYPE = 'Spanish_Colombia.1252';
    DROP DATABASE fenix;
                postgres    false            �            1259    24605    cliente    TABLE     �  CREATE TABLE public.cliente (
    id integer NOT NULL,
    primer_nombre character varying(30),
    segundo_nombre character varying(30),
    primer_apellido character varying(30),
    segundo_apellido character varying(30),
    celular character varying(15),
    email character varying(20),
    usuario_creacion character varying(10),
    usuario_update character varying(10),
    fecha_creacion date,
    fecha_update date
);
    DROP TABLE public.cliente;
       public         heap    postgres    false            �            1259    24603    cliente_id_seq    SEQUENCE     �   CREATE SEQUENCE public.cliente_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.cliente_id_seq;
       public          postgres    false    203                        0    0    cliente_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE public.cliente_id_seq OWNED BY public.cliente.id;
          public          postgres    false    202            �            1259    24621    info_tarjeta    TABLE     d  CREATE TABLE public.info_tarjeta (
    id integer NOT NULL,
    id_cliente integer,
    monto_aprobado double precision,
    monto_gastado double precision,
    cvv integer,
    bloqueo boolean,
    num_tarjeta integer,
    usuario_creacion character varying(10),
    usuario_update character varying(10),
    fecha_creacion date,
    fecha_update date
);
     DROP TABLE public.info_tarjeta;
       public         heap    postgres    false            �            1259    24619    info_tarjeta_id_seq    SEQUENCE     �   CREATE SEQUENCE public.info_tarjeta_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.info_tarjeta_id_seq;
       public          postgres    false    205            !           0    0    info_tarjeta_id_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.info_tarjeta_id_seq OWNED BY public.info_tarjeta.id;
          public          postgres    false    204            �            1259    24629    informacion_laboral    TABLE     T  CREATE TABLE public.informacion_laboral (
    id integer NOT NULL,
    id_cliente integer,
    ocupacion_laboral character varying(20),
    profesion character varying(20),
    ingresos double precision,
    usuario_creacion character varying(10),
    usuario_update character varying(10),
    fecha_creacion date,
    fecha_update date
);
 '   DROP TABLE public.informacion_laboral;
       public         heap    postgres    false            �            1259    24627    informacion_laboral_id_seq    SEQUENCE     �   CREATE SEQUENCE public.informacion_laboral_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.informacion_laboral_id_seq;
       public          postgres    false    207            "           0    0    informacion_laboral_id_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.informacion_laboral_id_seq OWNED BY public.informacion_laboral.id;
          public          postgres    false    206            �
           2604    24608 
   cliente id    DEFAULT     h   ALTER TABLE ONLY public.cliente ALTER COLUMN id SET DEFAULT nextval('public.cliente_id_seq'::regclass);
 9   ALTER TABLE public.cliente ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    202    203    203            �
           2604    24624    info_tarjeta id    DEFAULT     r   ALTER TABLE ONLY public.info_tarjeta ALTER COLUMN id SET DEFAULT nextval('public.info_tarjeta_id_seq'::regclass);
 >   ALTER TABLE public.info_tarjeta ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    205    204    205            �
           2604    24632    informacion_laboral id    DEFAULT     �   ALTER TABLE ONLY public.informacion_laboral ALTER COLUMN id SET DEFAULT nextval('public.informacion_laboral_id_seq'::regclass);
 E   ALTER TABLE public.informacion_laboral ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    207    206    207                      0    24605    cliente 
   TABLE DATA           �   COPY public.cliente (id, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, celular, email, usuario_creacion, usuario_update, fecha_creacion, fecha_update) FROM stdin;
    public          postgres    false    203   �!                 0    24621    info_tarjeta 
   TABLE DATA           �   COPY public.info_tarjeta (id, id_cliente, monto_aprobado, monto_gastado, cvv, bloqueo, num_tarjeta, usuario_creacion, usuario_update, fecha_creacion, fecha_update) FROM stdin;
    public          postgres    false    205   �!                 0    24629    informacion_laboral 
   TABLE DATA           �   COPY public.informacion_laboral (id, id_cliente, ocupacion_laboral, profesion, ingresos, usuario_creacion, usuario_update, fecha_creacion, fecha_update) FROM stdin;
    public          postgres    false    207   �!       #           0    0    cliente_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.cliente_id_seq', 1, false);
          public          postgres    false    202            $           0    0    info_tarjeta_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.info_tarjeta_id_seq', 1, false);
          public          postgres    false    204            %           0    0    informacion_laboral_id_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.informacion_laboral_id_seq', 1, false);
          public          postgres    false    206            �
           2606    24610    cliente cliente_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.cliente DROP CONSTRAINT cliente_pkey;
       public            postgres    false    203            �
           2606    24626    info_tarjeta info_tarjeta_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.info_tarjeta
    ADD CONSTRAINT info_tarjeta_pkey PRIMARY KEY (id);
 H   ALTER TABLE ONLY public.info_tarjeta DROP CONSTRAINT info_tarjeta_pkey;
       public            postgres    false    205            �
           2606    24634 ,   informacion_laboral informacion_laboral_pkey 
   CONSTRAINT     j   ALTER TABLE ONLY public.informacion_laboral
    ADD CONSTRAINT informacion_laboral_pkey PRIMARY KEY (id);
 V   ALTER TABLE ONLY public.informacion_laboral DROP CONSTRAINT informacion_laboral_pkey;
       public            postgres    false    207            �
           2606    24635 ,   informacion_laboral fk_cliente_info_laboral1    FK CONSTRAINT     �   ALTER TABLE ONLY public.informacion_laboral
    ADD CONSTRAINT fk_cliente_info_laboral1 FOREIGN KEY (id_cliente) REFERENCES public.cliente(id);
 V   ALTER TABLE ONLY public.informacion_laboral DROP CONSTRAINT fk_cliente_info_laboral1;
       public          postgres    false    2703    207    203            �
           2606    24640 $   info_tarjeta fk_cliente_info_tarjeta    FK CONSTRAINT     �   ALTER TABLE ONLY public.info_tarjeta
    ADD CONSTRAINT fk_cliente_info_tarjeta FOREIGN KEY (id_cliente) REFERENCES public.cliente(id);
 N   ALTER TABLE ONLY public.info_tarjeta DROP CONSTRAINT fk_cliente_info_tarjeta;
       public          postgres    false    205    203    2703                  x������ � �            x������ � �            x������ � �     