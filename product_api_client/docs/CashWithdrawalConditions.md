

# CashWithdrawalConditions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** |  |  [optional] |
|**numberOfAtms** | **Integer** |  |  [optional] |
|**atmNetworks** | [**Set&lt;AtmNetworksEnum&gt;**](#Set&lt;AtmNetworksEnum&gt;) |  |  [optional] |
|**withdrawalFrequency** | [**WithdrawalFrequencyEnum**](#WithdrawalFrequencyEnum) |  |  [optional] |



## Enum: Set&lt;AtmNetworksEnum&gt;

| Name | Value |
|---- | -----|
| CASHPOOL | &quot;CASHPOOL&quot; |
| CASH_GROUP | &quot;CASH_GROUP&quot; |
| BANKCARD_SERVICENETZ | &quot;BANKCARD_SERVICENETZ&quot; |
| ING | &quot;ING&quot; |
| VISA | &quot;VISA&quot; |
| MASTERCARD | &quot;MASTERCARD&quot; |
| SPARKASSE | &quot;SPARKASSE&quot; |



## Enum: WithdrawalFrequencyEnum

| Name | Value |
|---- | -----|
| LIMITED | &quot;LIMITED&quot; |
| UNLIMITED | &quot;UNLIMITED&quot; |



