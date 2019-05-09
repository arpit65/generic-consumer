create STREAM inv_unit_stream(
inv_unit_gkey varchar,
inv_unit_id varchar,
inv_unit_foreignhost_key varchar,
inv_unit_visit_state varchar,
inv_unit_needs_review varchar,
inv_unit_placards_mismatched varchar,
inv_unit_create_time varchar,
inv_unit_declrd_ib_cv varchar,
inv_unit_category varchar,
inv_unit_freight_kind varchar,
inv_unit_dray_status varchar,
inv_unit_complex_gkey varchar,
inv_unit_goods varchar,
inv_unit_special_stow_gkey varchar,
inv_unit_special_stow2_gkey varchar,
inv_unit_special_stow3_gkey varchar,
inv_unit_deck_rqmnt varchar,
inv_unit_requires_power varchar,
inv_unit_is_powered varchar,
inv_unit_want_powered varchar,
inv_unit_power_rqst_time varchar,
inv_unit_is_alarm_on varchar,
inv_unit_is_oog varchar,
inv_unit_oog_back_cm varchar,
inv_unit_oog_front_cm varchar,
inv_unit_oog_left_cm varchar,
inv_unit_oog_right_cm varchar,
inv_unit_oog_top_cm varchar,
inv_unit_vldt_rlgp varchar,
inv_unit_xfer_rlgp varchar,
inv_unit_line_op varchar,
inv_unit_goods_and_ctr_wt_kg varchar,
inv_unit_goods_ctr_wt_kg_advised varchar,
inv_unit_goods_ctr_wt_kg_gate_measured varchar,
inv_unit_goods_ctr_wt_kg_yard_measured varchar,
inv_unit_ign_pyld_wghts varchar,
inv_unit_ign_pyld_hghts varchar,
inv_unit_is_stowplan_posted varchar,
inv_unit_seal_nbr1 varchar,
inv_unit_seal_nbr2 varchar,
inv_unit_seal_nbr3 varchar,
inv_unit_seal_nbr4 varchar,
inv_unit_is_ctr_sealed varchar,
inv_unit_is_bundle varchar,
inv_unit_active_ufv varchar,
inv_unit_primary_ue varchar,
inv_unit_carriage_ue varchar,
inv_unit_opl_gkey varchar,
inv_unit_pol_gkey varchar,
inv_unit_cv_gkey varchar,
inv_unit_service_gkey varchar,
inv_unit_pod1_gkey varchar,
inv_unit_pod2_gkey varchar,
inv_unit_opt1_gkey varchar,
inv_unit_opt2_gkey varchar,
inv_unit_opt3_gkey varchar,
inv_unit_group_gkey varchar,
inv_unit_description varchar,
inv_unit_export_clearance_nbr varchar,
inv_unit_return_to_location varchar,
inv_unit_trucking_company varchar,
inv_unit_pin_nbr varchar,
inv_unit_bond_trucking_company varchar,
inv_unit_bonded_destination varchar,
inv_unit_ido_gkey varchar,
inv_unit_ido_expiry_date varchar,
inv_unit_time_denorm_calc varchar,
inv_unit_time_state_change varchar,
inv_unit_stopped_vessel varchar,
inv_unit_stopped_rail varchar,
inv_unit_stopped_road varchar,
inv_unit_imped_vessel varchar,
inv_unit_imped_rail varchar,
inv_unit_imped_road varchar,
inv_unit_remark varchar,
inv_unit_way_bill_nbr varchar,
inv_unit_way_bill_date varchar,
inv_unit_export_release_nbr varchar,
inv_unit_export_release_date varchar,
inv_unit_flex_string01 varchar,
inv_unit_flex_string02 varchar,
inv_unit_flex_string03 varchar,
inv_unit_flex_string04 varchar,
inv_unit_flex_string05 varchar,
inv_unit_flex_string06 varchar,
inv_unit_flex_string07 varchar,
inv_unit_flex_string08 varchar,
inv_unit_flex_string09 varchar,
inv_unit_flex_string10 varchar,
inv_unit_flex_string11 varchar,
inv_unit_flex_string12 varchar,
inv_unit_flex_string13 varchar,
inv_unit_flex_string14 varchar,
inv_unit_flex_string15 varchar,
inv_unit_touch_ctr varchar,
inv_unit_inbond varchar,
inv_unit_exam varchar,
inv_unit_acry_equip_ids varchar,
inv_unit_customs_id varchar,
inv_unit_agent1 varchar,
inv_unit_agent2 varchar,
inv_unit_changed varchar,
inv_unit_cargo_quantity varchar,
inv_unit_cargo_quantity_unit varchar,
inv_unit_goods_ctr_wt_kg_qc_measured varchar,
inv_unit_projected_pod_gkey varchar,
inv_unit_CUSTDFF_PREAN_PROCESSED_TIME varchar,
inv_unit_CUSTDFF_UNIT_IDOEXPIRES varchar,
inv_unit_related_unit varchar,
inv_unit_relationship_role varchar,
inv_unit_unit_combo varchar,
inv_unit_eq_gkey varchar,
inv_unit_carriage_unit varchar,
inv_unit_eqs_gkey varchar,
inv_unit_damage varchar,
inv_unit_sparcs_damage_code varchar,
inv_unit_dmgs_gkey varchar,
inv_unit_condition_gkey varchar,
inv_unit_bad_nbr varchar,
inv_unit_is_folded varchar,
inv_unit_arrive_order_item_gkey varchar,
inv_unit_depart_order_item_gkey varchar,
inv_unit_is_reserved varchar,
inv_unit_mnr_status_gkey varchar,
inv_unit_placarded varchar,
inv_unit_grade_gkey varchar,
inv_unit_goods_ctr_wt_kg_vgm varchar,
inv_unit_unit_gross_weight_source varchar,
inv_unit_unit_vgm_entity varchar,
inv_unit_unit_vgm_verified_date varchar,
inv_unit_declrd_ib_cv_fk varchar,
inv_unit_complex_gkey_fk varchar,
inv_unit_goods_fk varchar,
inv_unit_special_stow_gkey_fk varchar,
inv_unit_special_stow2_gkey_fk varchar,
inv_unit_special_stow3_gkey_fk varchar,
inv_unit_line_op_fk varchar,
inv_unit_active_ufv_fk varchar,
inv_unit_primary_ue_fk varchar,
inv_unit_carriage_ue_fk varchar,
inv_unit_opl_gkey_fk varchar,
inv_unit_pol_gkey_fk varchar,
inv_unit_cv_gkey_fk varchar,
inv_unit_service_gkey_fk varchar,
inv_unit_pod1_gkey_fk varchar,
inv_unit_pod2_gkey_fk varchar,
inv_unit_opt1_gkey_fk varchar,
inv_unit_opt2_gkey_fk varchar,
inv_unit_opt3_gkey_fk varchar,
inv_unit_group_gkey_fk varchar,
inv_unit_trucking_company_fk varchar,
inv_unit_bond_trucking_company_fk varchar,
inv_unit_ido_gkey_fk varchar,
inv_unit_agent1_fk varchar,
inv_unit_agent2_fk varchar,
inv_unit_projected_pod_gkey_fk varchar,
inv_unit_related_unit_fk varchar,
inv_unit_unit_combo_fk varchar,
inv_unit_eq_gkey_fk varchar,
inv_unit_carriage_unit_fk varchar,
inv_unit_eqs_gkey_fk varchar,
inv_unit_dmgs_gkey_fk varchar,
inv_unit_condition_gkey_fk varchar,
inv_unit_arrive_order_item_gkey_fk varchar,
inv_unit_depart_order_item_gkey_fk varchar,
inv_unit_mnr_status_gkey_fk varchar,
inv_unit_grade_gkey_fk varchar,
inv_unit_multi_tenant_pk varchar,
inv_unit_operation varchar,
inv_unit_timestamp varchar
) with (VALUE_FORMAT = 'JSON', KAFKA_TOPIC = 'inv_unit');



CREATE STREAM inv_unit_stream_rekeyed with(PARTITIONS=16) AS select
inv_unit_gkey,
inv_unit_id,
inv_unit_foreignhost_key,
inv_unit_visit_state,
inv_unit_needs_review,
inv_unit_placards_mismatched,
inv_unit_create_time,
inv_unit_declrd_ib_cv,
inv_unit_category,
inv_unit_freight_kind,
inv_unit_dray_status,
inv_unit_complex_gkey,
inv_unit_goods,
inv_unit_special_stow_gkey,
inv_unit_special_stow2_gkey,
inv_unit_special_stow3_gkey,
inv_unit_deck_rqmnt,
inv_unit_requires_power,
inv_unit_is_powered,
inv_unit_want_powered,
inv_unit_power_rqst_time,
inv_unit_is_alarm_on,
inv_unit_is_oog,
inv_unit_oog_back_cm,
inv_unit_oog_front_cm,
inv_unit_oog_left_cm,
inv_unit_oog_right_cm,
inv_unit_oog_top_cm,
inv_unit_vldt_rlgp,
inv_unit_xfer_rlgp,
inv_unit_line_op,
inv_unit_goods_and_ctr_wt_kg,
inv_unit_goods_ctr_wt_kg_advised,
inv_unit_goods_ctr_wt_kg_gate_measured,
inv_unit_goods_ctr_wt_kg_yard_measured,
inv_unit_ign_pyld_wghts,
inv_unit_ign_pyld_hghts,
inv_unit_is_stowplan_posted,
inv_unit_seal_nbr1,
inv_unit_seal_nbr2,
inv_unit_seal_nbr3,
inv_unit_seal_nbr4,
inv_unit_is_ctr_sealed,
inv_unit_is_bundle,
inv_unit_active_ufv,
inv_unit_primary_ue,
inv_unit_carriage_ue,
inv_unit_opl_gkey,
inv_unit_pol_gkey,
inv_unit_cv_gkey,
inv_unit_service_gkey,
inv_unit_pod1_gkey,
inv_unit_pod2_gkey,
inv_unit_opt1_gkey,
inv_unit_opt2_gkey,
inv_unit_opt3_gkey,
inv_unit_group_gkey,
inv_unit_description,
inv_unit_export_clearance_nbr,
inv_unit_return_to_location,
inv_unit_trucking_company,
inv_unit_pin_nbr,
inv_unit_bond_trucking_company,
inv_unit_bonded_destination,
inv_unit_ido_gkey,
inv_unit_ido_expiry_date,
inv_unit_time_denorm_calc,
inv_unit_time_state_change,
inv_unit_stopped_vessel,
inv_unit_stopped_rail,
inv_unit_stopped_road,
inv_unit_imped_vessel,
inv_unit_imped_rail,
inv_unit_imped_road,
inv_unit_remark,
inv_unit_way_bill_nbr,
inv_unit_way_bill_date,
inv_unit_export_release_nbr,
inv_unit_export_release_date,
inv_unit_flex_string01,
inv_unit_flex_string02,
inv_unit_flex_string03,
inv_unit_flex_string04,
inv_unit_flex_string05,
inv_unit_flex_string06,
inv_unit_flex_string07,
inv_unit_flex_string08,
inv_unit_flex_string09,
inv_unit_flex_string10,
inv_unit_flex_string11,
inv_unit_flex_string12,
inv_unit_flex_string13,
inv_unit_flex_string14,
inv_unit_flex_string15,
inv_unit_touch_ctr,
inv_unit_inbond,
inv_unit_exam,
inv_unit_acry_equip_ids,
inv_unit_customs_id,
inv_unit_agent1,
inv_unit_agent2,
inv_unit_changed,
inv_unit_cargo_quantity,
inv_unit_cargo_quantity_unit,
inv_unit_goods_ctr_wt_kg_qc_measured,
inv_unit_projected_pod_gkey,
inv_unit_CUSTDFF_PREAN_PROCESSED_TIME,
inv_unit_CUSTDFF_UNIT_IDOEXPIRES,
inv_unit_related_unit,
inv_unit_relationship_role,
inv_unit_unit_combo,
inv_unit_eq_gkey,
inv_unit_carriage_unit,
inv_unit_eqs_gkey,
inv_unit_damage,
inv_unit_sparcs_damage_code,
inv_unit_dmgs_gkey,
inv_unit_condition_gkey,
inv_unit_bad_nbr,
inv_unit_is_folded,
inv_unit_arrive_order_item_gkey,
inv_unit_depart_order_item_gkey,
inv_unit_is_reserved,
inv_unit_mnr_status_gkey,
inv_unit_placarded,
inv_unit_grade_gkey,
inv_unit_goods_ctr_wt_kg_vgm,
inv_unit_unit_gross_weight_source,
inv_unit_unit_vgm_entity,
inv_unit_unit_vgm_verified_date,
inv_unit_declrd_ib_cv_fk,
inv_unit_complex_gkey_fk,
inv_unit_goods_fk,
inv_unit_special_stow_gkey_fk,
inv_unit_special_stow2_gkey_fk,
inv_unit_special_stow3_gkey_fk,
inv_unit_line_op_fk,
case when inv_unit_active_ufv_fk is null then '0' else inv_unit_active_ufv_fk end as inv_unit_active_ufv_fk,
inv_unit_primary_ue_fk,
inv_unit_carriage_ue_fk,
inv_unit_opl_gkey_fk,
inv_unit_pol_gkey_fk,
inv_unit_cv_gkey_fk,
inv_unit_service_gkey_fk,
inv_unit_pod1_gkey_fk,
inv_unit_pod2_gkey_fk,
inv_unit_opt1_gkey_fk,
inv_unit_opt2_gkey_fk,
inv_unit_opt3_gkey_fk,
inv_unit_group_gkey_fk,
inv_unit_trucking_company_fk,
inv_unit_bond_trucking_company_fk,
inv_unit_ido_gkey_fk,
inv_unit_agent1_fk,
inv_unit_agent2_fk,
inv_unit_projected_pod_gkey_fk,
inv_unit_related_unit_fk,
inv_unit_unit_combo_fk,
inv_unit_eq_gkey_fk,
inv_unit_carriage_unit_fk,
inv_unit_eqs_gkey_fk,
inv_unit_dmgs_gkey_fk,
inv_unit_condition_gkey_fk,
inv_unit_arrive_order_item_gkey_fk,
inv_unit_depart_order_item_gkey_fk,
inv_unit_mnr_status_gkey_fk,
inv_unit_grade_gkey_fk,
inv_unit_multi_tenant_pk,
inv_unit_operation,
inv_unit_timestamp FROM inv_unit_stream PARTITION BY inv_unit_active_ufv_fk;


CREATE TABLE inv_unit (
inv_unit_gkey varchar,
inv_unit_id varchar,
inv_unit_foreignhost_key varchar,
inv_unit_visit_state varchar,
inv_unit_needs_review varchar,
inv_unit_placards_mismatched varchar,
inv_unit_create_time varchar,
inv_unit_declrd_ib_cv varchar,
inv_unit_category varchar,
inv_unit_freight_kind varchar,
inv_unit_dray_status varchar,
inv_unit_complex_gkey varchar,
inv_unit_goods varchar,
inv_unit_special_stow_gkey varchar,
inv_unit_special_stow2_gkey varchar,
inv_unit_special_stow3_gkey varchar,
inv_unit_deck_rqmnt varchar,
inv_unit_requires_power varchar,
inv_unit_is_powered varchar,
inv_unit_want_powered varchar,
inv_unit_power_rqst_time varchar,
inv_unit_is_alarm_on varchar,
inv_unit_is_oog varchar,
inv_unit_oog_back_cm varchar,
inv_unit_oog_front_cm varchar,
inv_unit_oog_left_cm varchar,
inv_unit_oog_right_cm varchar,
inv_unit_oog_top_cm varchar,
inv_unit_vldt_rlgp varchar,
inv_unit_xfer_rlgp varchar,
inv_unit_line_op varchar,
inv_unit_goods_and_ctr_wt_kg varchar,
inv_unit_goods_ctr_wt_kg_advised varchar,
inv_unit_goods_ctr_wt_kg_gate_measured varchar,
inv_unit_goods_ctr_wt_kg_yard_measured varchar,
inv_unit_ign_pyld_wghts varchar,
inv_unit_ign_pyld_hghts varchar,
inv_unit_is_stowplan_posted varchar,
inv_unit_seal_nbr1 varchar,
inv_unit_seal_nbr2 varchar,
inv_unit_seal_nbr3 varchar,
inv_unit_seal_nbr4 varchar,
inv_unit_is_ctr_sealed varchar,
inv_unit_is_bundle varchar,
inv_unit_active_ufv varchar,
inv_unit_primary_ue varchar,
inv_unit_carriage_ue varchar,
inv_unit_opl_gkey varchar,
inv_unit_pol_gkey varchar,
inv_unit_cv_gkey varchar,
inv_unit_service_gkey varchar,
inv_unit_pod1_gkey varchar,
inv_unit_pod2_gkey varchar,
inv_unit_opt1_gkey varchar,
inv_unit_opt2_gkey varchar,
inv_unit_opt3_gkey varchar,
inv_unit_group_gkey varchar,
inv_unit_description varchar,
inv_unit_export_clearance_nbr varchar,
inv_unit_return_to_location varchar,
inv_unit_trucking_company varchar,
inv_unit_pin_nbr varchar,
inv_unit_bond_trucking_company varchar,
inv_unit_bonded_destination varchar,
inv_unit_ido_gkey varchar,
inv_unit_ido_expiry_date varchar,
inv_unit_time_denorm_calc varchar,
inv_unit_time_state_change varchar,
inv_unit_stopped_vessel varchar,
inv_unit_stopped_rail varchar,
inv_unit_stopped_road varchar,
inv_unit_imped_vessel varchar,
inv_unit_imped_rail varchar,
inv_unit_imped_road varchar,
inv_unit_remark varchar,
inv_unit_way_bill_nbr varchar,
inv_unit_way_bill_date varchar,
inv_unit_export_release_nbr varchar,
inv_unit_export_release_date varchar,
inv_unit_flex_string01 varchar,
inv_unit_flex_string02 varchar,
inv_unit_flex_string03 varchar,
inv_unit_flex_string04 varchar,
inv_unit_flex_string05 varchar,
inv_unit_flex_string06 varchar,
inv_unit_flex_string07 varchar,
inv_unit_flex_string08 varchar,
inv_unit_flex_string09 varchar,
inv_unit_flex_string10 varchar,
inv_unit_flex_string11 varchar,
inv_unit_flex_string12 varchar,
inv_unit_flex_string13 varchar,
inv_unit_flex_string14 varchar,
inv_unit_flex_string15 varchar,
inv_unit_touch_ctr varchar,
inv_unit_inbond varchar,
inv_unit_exam varchar,
inv_unit_acry_equip_ids varchar,
inv_unit_customs_id varchar,
inv_unit_agent1 varchar,
inv_unit_agent2 varchar,
inv_unit_changed varchar,
inv_unit_cargo_quantity varchar,
inv_unit_cargo_quantity_unit varchar,
inv_unit_goods_ctr_wt_kg_qc_measured varchar,
inv_unit_projected_pod_gkey varchar,
inv_unit_CUSTDFF_PREAN_PROCESSED_TIME varchar,
inv_unit_CUSTDFF_UNIT_IDOEXPIRES varchar,
inv_unit_related_unit varchar,
inv_unit_relationship_role varchar,
inv_unit_unit_combo varchar,
inv_unit_eq_gkey varchar,
inv_unit_carriage_unit varchar,
inv_unit_eqs_gkey varchar,
inv_unit_damage varchar,
inv_unit_sparcs_damage_code varchar,
inv_unit_dmgs_gkey varchar,
inv_unit_condition_gkey varchar,
inv_unit_bad_nbr varchar,
inv_unit_is_folded varchar,
inv_unit_arrive_order_item_gkey varchar,
inv_unit_depart_order_item_gkey varchar,
inv_unit_is_reserved varchar,
inv_unit_mnr_status_gkey varchar,
inv_unit_placarded varchar,
inv_unit_grade_gkey varchar,
inv_unit_goods_ctr_wt_kg_vgm varchar,
inv_unit_unit_gross_weight_source varchar,
inv_unit_unit_vgm_entity varchar,
inv_unit_unit_vgm_verified_date varchar,
inv_unit_declrd_ib_cv_fk varchar,
inv_unit_complex_gkey_fk varchar,
inv_unit_goods_fk varchar,
inv_unit_special_stow_gkey_fk varchar,
inv_unit_special_stow2_gkey_fk varchar,
inv_unit_special_stow3_gkey_fk varchar,
inv_unit_line_op_fk varchar,
inv_unit_active_ufv_fk varchar,
inv_unit_primary_ue_fk varchar,
inv_unit_carriage_ue_fk varchar,
inv_unit_opl_gkey_fk varchar,
inv_unit_pol_gkey_fk varchar,
inv_unit_cv_gkey_fk varchar,
inv_unit_service_gkey_fk varchar,
inv_unit_pod1_gkey_fk varchar,
inv_unit_pod2_gkey_fk varchar,
inv_unit_opt1_gkey_fk varchar,
inv_unit_opt2_gkey_fk varchar,
inv_unit_opt3_gkey_fk varchar,
inv_unit_group_gkey_fk varchar,
inv_unit_trucking_company_fk varchar,
inv_unit_bond_trucking_company_fk varchar,
inv_unit_ido_gkey_fk varchar,
inv_unit_agent1_fk varchar,
inv_unit_agent2_fk varchar,
inv_unit_projected_pod_gkey_fk varchar,
inv_unit_related_unit_fk varchar,
inv_unit_unit_combo_fk varchar,
inv_unit_eq_gkey_fk varchar,
inv_unit_carriage_unit_fk varchar,
inv_unit_eqs_gkey_fk varchar,
inv_unit_dmgs_gkey_fk varchar,
inv_unit_condition_gkey_fk varchar,
inv_unit_arrive_order_item_gkey_fk varchar,
inv_unit_depart_order_item_gkey_fk varchar,
inv_unit_mnr_status_gkey_fk varchar,
inv_unit_grade_gkey_fk varchar,
inv_unit_multi_tenant_pk varchar,
inv_unit_operation varchar,
inv_unit_timestamp varchar
) WITH (KAFKA_TOPIC='INV_UNIT_STREAM_REKEYED',VALUE_FORMAT='JSON',KEY='inv_unit_active_ufv_fk');