
import java.time.LocalDateTime

import com.sksamuel.avro4s.AvroSchema

case class ProcessTable(id: Int, uuid: String, its: LocalDateTime, mandant: String, use_case: String, coria_id: String, event_type: String, source_db: String,
                        source_table: String, target_db: String, target_table: String, status_code: Int, status: String, business_ts: LocalDateTime, delivery_ts: LocalDateTime,
                        cda_date: LocalDateTime, cda_year: Int, processed_rows: Long, se_new: String, se_missing: String, se_typecast: String, se_deprecated: String, process_id: Int)

val schema = AvroSchema[ProcessTable]
