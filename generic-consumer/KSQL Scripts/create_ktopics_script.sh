#!/usr/bin/bash

kafka-topics --create --bootstrap-server 10.43.131.185:9092 --replication-factor 1 --partitions 4 --topic inv_wi
kafka-topics --create --bootstrap-server 10.43.131.185:9092 --replication-factor 1 --partitions 4 --topic inv_wq
kafka-topics --create --bootstrap-server 10.43.131.185:9092 --replication-factor 1 --partitions 4 --topic argo_facility
kafka-topics --create --bootstrap-server 10.43.131.185:9092 --replication-factor 1 --partitions 4 --topic xps_craneshift
kafka-topics --create --bootstrap-server 10.43.131.185:9092 --replication-factor 1 --partitions 4 --topic xps_pointofwork
kafka-topics --create --bootstrap-server 10.43.131.185:9092 --replication-factor 1 --partitions 4 --topic inv_unit
kafka-topics --create --bootstrap-server 10.43.131.185:9092 --replication-factor 1 --partitions 4 --topic inv_unit_fcy_visit
kafka-topics --create --bootstrap-server 10.43.131.185:9092 --replication-factor 1 --partitions 4 --topic inv_unit_yrd_visit
kafka-topics --create --bootstrap-server 10.43.131.185:9092 --replication-factor 1 --partitions 4 --topic ref_equipment
kafka-topics --create --bootstrap-server 10.43.131.185:9092 --replication-factor 1 --partitions 4 --topic ref_equip_type
kafka-topics --create --bootstrap-server 10.43.131.185:9092 --replication-factor 1 --partitions 4 --topic inv_goods
kafka-topics --create --bootstrap-server 10.43.131.185:9092 --replication-factor 1 --partitions 4 --topic argo_complex
kafka-topics --create --bootstrap-server 10.43.131.185:9092 --replication-factor 1 --partitions 4 --topic ref_bizunit_scoped


DROP STREAM [IF EXISTS] INV_WI_FCY_INV_WQ_QCSHIFT_POW [DELETE TOPIC];
DROP STREAM [IF EXISTS] INV_WI_FCY_INV_WQ_QCSHIFT [DELETE TOPIC];
DROP STREAM [IF EXISTS] INV_WI_FCY_INV_WQ [DELETE TOPIC];