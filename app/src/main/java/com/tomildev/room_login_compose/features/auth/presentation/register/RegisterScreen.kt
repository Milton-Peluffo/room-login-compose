package com.tomildev.room_login_compose.features.auth.presentation.register

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.tomildev.compose_samples.views.textFields.basic_login.components.TextFieldPrimary
import com.tomildev.room_login_compose.features.auth.presentation.components.AuthTextAction
import com.tomildev.room_login_compose.features.auth.presentation.components.AuthTitle
import com.tomildev.room_login_compose.features.auth.presentation.components.ButtomPrimary

@Composable
fun RegisterScreen(
    modifier: Modifier = Modifier,
) {
    Scaffold { innerPadding ->

        Column(
            modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AuthTitle(
                title = "HEY THERE!",
                subtitle = "Create your account"
            )
            TextFieldPrimary(
                modifier = Modifier,
                value = "",
                onValueChange = { "" },
                label = "Email"
            )
            TextFieldPrimary(
                modifier = Modifier,
                value = "",
                onValueChange = { "" },
                label = "Password"
            )
            TextFieldPrimary(
                modifier = Modifier,
                value = "",
                onValueChange = { "" },
                label = "Confirm password"
            )
            Spacer(Modifier.height(20.dp))
            ButtomPrimary(
                text = "Sign up",
                onClick = {}
            )
            Spacer(Modifier.height(20.dp))
            AuthTextAction(
                text = "I already have an account",
                onClick = { }
            )
        }
    }
}