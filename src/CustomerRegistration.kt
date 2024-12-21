class CustomerRegistration(val dbHelper: DatabaseHelper) {
    private val databaseHelper = DatabaseHelper()
    fun register(){
       val connectionString = databaseHelper.connectToDB()
        databaseHelper.variable = "a"
    }

    fun saveRegistrationResult(){
        print( databaseHelper.variable)
        val connectionString = databaseHelper.connectToDB()
    }
}