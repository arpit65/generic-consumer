create table argo_facility
(
fcy_operation varchar,
fcy_timestamp varchar,
fcy_gkey varchar,
fcy_id varchar,
fcy_name varchar,
fcy_non_operational varchar,
fcy_time_zone varchar,
fcy_life_cycle_state varchar,
fcy_cpx_gkey varchar,
fcy_rp_gkey varchar,
fcy_teu_green varchar,
fcy_teu_yellow varchar,
fcy_teu_red varchar,
fcy_jms_provider varchar,
fcy_jms_provider_url varchar,
fcy_jms_in_uri varchar,
fcy_jms_poll_in_uri varchar,
fcy_jms_poll_frequency varchar,
fcy_jms_out_uri varchar,
fcy_route_resolver_rules varchar,
fcy_multi_tenant_pk varchar
)
with (VALUE_FORMAT = 'JSON', KAFKA_TOPIC = 'argo_facility', KEY = 'fcy_multi_tenant_pk');