create table argo_complex (
cpx_gkey varchar,
cpx_id varchar,
cpx_name varchar,
cpx_time_zone varchar,
cpx_life_cycle_state varchar,
cpx_opr_gkey varchar,
cpx_berth_model_gkey varchar,
cpx_opr_gkey_fk varchar,
cpx_multi_tenant_pk varchar,
cpx_operation varchar,
cpx_timestamp varchar,
) WITH (KAFKA_TOPIC='argo_complex',VALUE_FORMAT='JSON',KEY='cpx_multi_tenant_pk');