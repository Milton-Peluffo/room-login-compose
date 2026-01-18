package com.tomildev.room_login_compose.features.auth.presentation.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.tomildev.compose_samples.views.textFields.basic_login.components.TextFieldPrimary
import com.tomildev.room_login_compose.features.auth.presentation.components.AuthTextAction
import com.tomildev.room_login_compose.features.auth.presentation.components.AuthTitle
import com.tomildev.room_login_compose.features.auth.presentation.components.ButtomPrimary


@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AuthTitle(
            title = "WELCOME BACK!",
            subtitle = "LOGIN"
        )
        TextFieldPrimary(
            modifier = Modifier,
            value = "",
            onValueChange = { "" },
            label = "Email"
        )
        Spacer(Modifier.height(10.dp))
        TextFieldPrimary(
            modifier = Modifier,
            value = "",
            onValueChange = { "" },
            label = "Password"
        )
        Spacer(Modifier.height(20.dp))
        ButtomPrimary(
            text = "Login",
            onClick = {}
        )
        Spacer(Modifier.height(20.dp))
        AuthTextAction(
            text = "I forgot my password",
            onClick = { }
        )
    }
}