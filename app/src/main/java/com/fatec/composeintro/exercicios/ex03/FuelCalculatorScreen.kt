package com.fatec.composeintro.exercicios.ex03

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
fun FuelCalculatorScreen() {
    var distanceInput by remember { mutableStateOf("") }
    var litersInput by remember { mutableStateOf("") }
    var priceInput by remember { mutableStateOf("") }

    var consumptionResult by remember { mutableStateOf("Preencha os campos para calcular.") }
    var totalCostResult by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Calculadora de Consumo e Gasto",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        // Campo para a distância percorrida
        TextField(
            value = distanceInput,
            onValueChange = { distanceInput = it },
            label = { Text("Distância percorrida (em Km)") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Campo para a quantidade de litros
        TextField(
            value = litersInput,
            onValueChange = { litersInput = it },
            label = { Text("Litros abastecidos") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Campo para o preço por litro
        TextField(
            value = priceInput,
            onValueChange = { priceInput = it },
            label = { Text("Preço por litro (ex: 5.50)") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Botão para o cálculo
        Button(
            onClick = {
                val distance = distanceInput.toFloatOrNull()
                val liters = litersInput.toFloatOrNull()
                val price = priceInput.toFloatOrNull()

                if (distance != null && liters != null && price != null && liters > 0) {
                    val averageConsumption = distance / liters
                    val totalCost = liters * price

                    consumptionResult = "Consumo médio: %.1f km/L".format(averageConsumption)
                    totalCostResult = "Gasto total: R$ %.2f".format(totalCost)
                } else {
                    consumptionResult = "Por favor, insira valores válidos."
                    totalCostResult = ""
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Calcular")
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Exibição dos resultados
        Text(
            text = consumptionResult,
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Medium
        )
        Text(
            text = totalCostResult,
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Medium
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FuelCalculatorPreview() {
    ComposeIntroTheme {
        FuelCalculatorScreen()
    }
}