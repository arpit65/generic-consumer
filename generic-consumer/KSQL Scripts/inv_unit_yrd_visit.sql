create stream inv_unit_yrd_visit_stream (
uyv_gkey varchar,
uyv_ufv_gkey varchar,
uyv_yrd_gkey varchar,
uyv_pkey varchar,
uyv_ufv_gkey_fk varchar,
uyv_yrd_gkey_fk varchar,
uyv_multi_tenant_pk varchar,
uyv_operation varchar,
uyv_timestamp varchar
)with (VALUE_FORMAT = 'JSON', KAFKA_TOPIC = 'inv_unit_yrd_visit');



CREATE STREAM inv_unit_yrd_visit_stream_rekeyed with (PARTITIONS=16) AS select
uyv_gkey,
uyv_ufv_gkey,
uyv_yrd_gkey,
uyv_pkey,
case when uyv_ufv_gkey_fk is null then '0' else uyv_ufv_gkey_fk end as uyv_ufv_gkey_fk,
uyv_yrd_gkey_fk,
uyv_multi_tenant_pk,
uyv_operation,
uyv_timestamp
FROM inv_unit_yrd_visit_stream PARTITION BY uyv_ufv_gkey_fk;



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
)with (VALUE_FORMAT = 'JSON', KAFKA_TOPIC = 'INV_UNIT_YRD_VISIT_STREAM_REKEYED',KEY='uyv_ufv_gkey_fk');


