import models.*
import java.io.File

private val separator = "\n----------------------------\n"
    private val fileName = "data.txt"

fun main(args: Array<String>) {

    val file = File(fileName).apply {
        createNewFile()
    }

    val array = mutableListOf<DeliveryModel>()
    val fullNameProvider = FullNameModel("Артем", "Акимов", "Игоревич")
    val date = DateModel(2,8,2023)
    val glue = GlueModel("Липкая кисточка", 12)
    val maskingTapeCount = 23
    val puttyCount = 3
    val fullNamePayer = FullNameModel("Максим","Крамаренко","Русланович")
    val payer = PayerModel(fullNamePayer,4400231453679900,8400234536479030)
    val delivery = DeliveryModel(fullNameProvider, date, glue, maskingTapeCount, puttyCount, payer)
    parseDelivery(delivery)
    array.add(delivery)
}

fun parseDelivery(delivery: DeliveryModel){
    with(delivery){
        val firstNameProvider = fullNameProvider.firstName
        val lastNameProvider = fullNameProvider.lastName
        val middleNameProvider = fullNameProvider.middleName

        val dayDelivery = date.day
        val monthDelivery = date.month
        val yearDelivery = date.year

        val glueBrand = glue.brand
        val glueCount = glue.count

        val maskingTapeCount = maskingTape
        val puttyCount = putty

        val firstNamePayer = payer.fullName.firstName
        val lastNamePayer = payer.fullName.lastName
        val middleNamePayer = payer.fullName.middleName
        val props = payer.props
        val currentAccount = payer.currentAccount

        val result = "Заказ %s\n Поставищик(ФИО): $firstNameProvider $lastNameProvider $middleNameProvider $separator" +
                "Дата доставки:\n День: $dayDelivery\n Месяц: $monthDelivery\n Год: $yearDelivery $separator" +
                "Клей обойный:\n Марка: $glueBrand\n Количество: $glueCount $separator" +
                "Лента малярная:\n Количество: $maskingTapeCount $separator" +
                "Шпаклевка:\n Количество: $puttyCount $separator" +
                "Плательщик:\n ФИО: $firstNamePayer $lastNamePayer $middleNamePayer\n Банковские реквизиты: $props\n Расчетный счет: $currentAccount"
        println(result)
    }



}