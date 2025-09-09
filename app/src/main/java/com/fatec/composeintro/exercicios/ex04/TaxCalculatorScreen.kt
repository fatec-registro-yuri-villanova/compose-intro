package com.fatec.composeintro.exercicios.ex04

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fatec.composeintro.ui.theme.ComposeIntroTheme

@Composable
fun TaxCalculatorScreen() {
    var salaryInput by remember { mutableStateOf("") }
    var resultText by remember { mutableStateOf("Insira o salário para calcular o IR.") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Calculadora de Imposto de Renda",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        // Campo para o valor do salário
        TextField(
            value = salaryInput,
            onValueChange = { salaryInput = it },
            label = { Text("Salário mensal (ex: 3500)") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(24.dp))


        Button(
            onClick = {
                val salary = salaryInput.toFloatOrNull()
                if (salary != null && salary >= 0) {
                    val taxRate: Float
                    val taxAmount: Float


                    when {
                        salary <= 2000.00f -> {
                            taxRate = 0.0f
                            taxAmount = 0.0f
                        }
                        salary <= 3000.00f -> {
                            taxRate = 0.075f
                            taxAmount = salary * taxRate
                        }
                        salary <= 4500.00f -> {
                            taxRate = 0.15f
                            taxAmount = salary * taxRate
                        }
                        else -> {
                            taxRate = 0.225f
                            taxAmount = salary * taxRate
                        }
                    }

                    if (taxAmount == 0.0f) {
                        resultText = "Imposto de Renda: Isento"
                    } else {
                        resultText = "Imposto de Renda: R$ %.2f".format(taxAmount)
                    }
                } else {
                    resultText = "Por favor, insira um valor de salário válido."
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Calcular IR")
        }

        Spacer(modifier = Modifier.height(24.dp))


        Text(
            text = resultText,
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Medium
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TaxCalculatorPreview() {
    ComposeIntroTheme  {
        TaxCalculatorScreen()
    }
}
