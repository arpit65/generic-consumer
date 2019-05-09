create table inv_unit_yrd_visit (
uyv_gkey varchar,
uyv_ufv_gkey varchar,
uyv_yrd_gkey varchar,
uyv_pkey varchar,
uyv_ufv_gkey_fk varchar,
uyv_yrd_gkey_fk varchar,
uyv_multi_tenant_pk varchar,
uyv_operation varchar,
uyv_timestamp varchar
)with (VALUE_FORMAT = 'JSON', KAFKA_TOPIC = 'inv_unit_yrd_visit', KEY = 'uyv_ufv_gkey_fk');
