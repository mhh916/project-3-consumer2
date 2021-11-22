import org.apache.spark.sql.types._

class SparkConnect(){

    val screeners = StructType(
        Array(
            StructField("id", IntegerType, false),
            StructField("first_name", StringType, false),
            StructField("last_name", StringType, false)
        )
    )

    val recruiters = StructType(
        Array(
            StructField("id", IntegerType, false),
            StructField("first_name", StringType, false),
            StructField("last_name", StringType, false)
        )
    )

    val qualifiedLead = StructType(
        Array(
            StructField("id", IntegerType, false),
            StructField("first_name", StringType, false),
            StructField("last_name", StringType, false),
            StructField("university", StringType, false),
            StructField("major", StringType, false),
            StructField("email", StringType, false),
            StructField("home_state", StringType, false)
        )
    )

    val contactAttempts = StructType(
        Array(
            StructField("recruiter_id", IntegerType, false),
            StructField("ql_id", IntegerType, false),
            StructField("contact_date", DateType, false),
            StructField("start_time", StringType, false),
            StructField("end_time", StringType, false),
            StructField("contact_method", StringType, false)
        )
    )

    val screening = StructType(
        Array(
            StructField("screener_id", IntegerType, false),
            StructField("ql_id", IntegerType, false),
            StructField("screening_date", DateType, false),
            StructField("start_time", StringType, false),
            StructField("end_time", StringType, false),
            StructField("screening_type", StringType, false),
            StructField("question_number", IntegerType, false),
            StructField("question_accepted", IntegerType, false)
            
        )
    )

    val offers = StructType(
        Array(
            StructField("screener_id", IntegerType, false),
            StructField("recruiter_id", IntegerType, false),
            StructField("ql_id", IntegerType, false),
            StructField("offer_extended_date", DateType, false),
            StructField("offer_action_date", DateType, false),
            StructField("contact_method", StringType, false),
            StructField("offer_action", StringType, false)
        )
    )

    
}