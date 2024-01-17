package com.heronet.sust.feature.campus.presentation.common.employee

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AlternateEmail
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Work
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.heronet.sust.R
import com.heronet.sust.feature.campus.domain.model.Employee


@Composable
fun EmployeeItem(
    employee: Employee
) {
    Box(modifier = Modifier.padding(8.dp)) {
        ElevatedCard(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
                    .padding(start = 16.dp)
            ) {
                AsyncImage(
                    model = employee.imageUrl,
                    contentDescription = "image",
                    modifier = Modifier
                        .width(96.dp)
                        .height(96.dp)
                        .clip(RoundedCornerShape(8.dp)),
                    contentScale = ContentScale.Fit,
                    error = painterResource(id = R.drawable.person),
                )

                Column(
                    Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    IconText(imageVector = Icons.Default.Person, text = employee.name)
                    IconText(imageVector = Icons.Default.Work, text = employee.jobTitle)
                    IconText(imageVector = Icons.Default.Phone, text = employee.phone)
                    IconText(imageVector = Icons.Default.AlternateEmail, text = employee.email)
                }
            }
            ActionRow(employee.email, employee.phone, employee.website)
        }
    }
}

@Composable
fun IconText(imageVector: ImageVector, text: String) {
    Row(
        modifier = Modifier.padding(2.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = imageVector,
            contentDescription = text,
            modifier = Modifier.padding(horizontal = 6.dp)
        )
        Text(
            text = text,
            style = MaterialTheme.typography.titleMedium,
        )
    }
}

@Composable
fun ActionRow(email: String, phone: String, website: String?) {
    Row(
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        val context = LocalContext.current
        Button(
            onClick = {
                val intent = Intent(Intent.ACTION_DIAL)
                intent.setData(Uri.parse("tel:$phone"))
                context.startActivity(intent, null)
            }
        ) {
            Text(text = "Call")
        }
        OutlinedButton(
            onClick = {
                val intent = Intent(Intent.ACTION_SENDTO)
                intent.setData(Uri.parse("mailto:$email"))
                context.startActivity(intent, null)
            },
            modifier = Modifier.padding(horizontal = 8.dp)
        ) {
            Text(text = "E-Mail")
        }
        website.let {
            OutlinedButton(
                onClick = {
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.setData(Uri.parse(it))
                    context.startActivity(intent, null)
                },
            ) {
                Text(text = "Web")
            }
        }

    }
}