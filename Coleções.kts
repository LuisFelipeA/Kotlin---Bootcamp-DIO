// Listas(List)

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)  //lista mutavel
val sudoers: List<Int> = systemUsers        //copia da lista anterior

fun addSystemUser(newUser: Int) {          //função para adcionar novos usuarios na lista
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {        //função para mostrar a lista copia
    return sudoers
}

fun main () {
    addSystemUser(4)		//adciona novo user na lista
    println("Tot sudoers: ${getSysSudoers().size}")  //Mostra o tamanho da lista
    getSysSudoers().forEach {
        i -> println("Some useful info on user $i")     //percorre a lista
    }
}


// Conjuntos(Set)

val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")

fun addIssue(uniqueDesc: String): Boolean) {
    return openIssues.add(uniqueDesc)
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registred correctly." else "marked as duplicate and rejected."
}

fun main() {
    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2"

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")
}


// Mapas(Map)

const val POINTS_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
val EZPassReport: Map<Int, Int> = EZPassAccounts

fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.constraintKey(accountId)) {
        println("Updating $accountId...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS
    } else{
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach{
        k, v -> println("ID $k: credit $v")
    }
}

fun main(){
    accountsReport()
    updatePointsCredit(1)
    updatePointsCredit(1)
    updatePointsCredit(5)
    accountsReport()
}