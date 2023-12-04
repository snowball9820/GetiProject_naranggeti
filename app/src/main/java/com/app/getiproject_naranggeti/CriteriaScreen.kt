package com.app.getiproject_naranggeti

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.app.getiproject_naranggeti.ui.theme.elice

@Composable
fun CriteriaScreen(navController: NavHostController) {

    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(scrollState),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(12.dp))

        Card {
                Text(
                    text = "단순 참고용 등급 분류 기준 입니다.",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    fontFamily = elice
                )
        }

//            Spacer(modifier = Modifier.height(12.dp))
//
//            Image(
//                painter = painterResource(id = R.drawable.description),
//                contentDescription = "총점 이미지",
//                modifier = Modifier
//                    .width(500.dp)
//                    .height(700.dp)
//            )

        Spacer(modifier = Modifier.height(6.dp))

        Image(
            painter = painterResource(id = R.drawable.criteria_front_back),
            contentDescription = "전면, 후면 이미지",
            modifier = Modifier
                .width(500.dp)
                .height(700.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.criteria_under),
            contentDescription = "아래 이미지",
            modifier = Modifier
                .width(500.dp)
                .height(700.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.criteria_leftover),
            contentDescription = "나머지 이미지",
            modifier = Modifier
                .width(500.dp)
                .height(700.dp)
        )
    }

}