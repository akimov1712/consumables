package models

data class DeliveryModel(
     val fullNameProvider: FullNameModel,
     val date: DateModel,
     val glue: GlueModel,
     val maskingTape: Int,
     val putty: Int,
     val payer: PayerModel
)