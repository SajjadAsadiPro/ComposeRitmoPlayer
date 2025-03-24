package ir.sajjadasadi.RitmoPlayer.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import ir.sajjadasadi.RitmoPlayer.R

// تعریف فونت وزیر
val VazirFont = FontFamily(
    Font(R.font.vazirmatn, FontWeight.Normal),
    Font(R.font.vazirmatnbold, FontWeight.Bold)
)

// تنظیم تایپوگرافی با فونت وزیر
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = VazirFont,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.5.sp
    ),
    titleLarge = TextStyle(
        fontFamily = VazirFont,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ), titleSmall = TextStyle(
        fontFamily = VazirFont,
        fontWeight = FontWeight.Normal, fontSize = 16.sp
    ),
    bodySmall = TextStyle(
        fontFamily = VazirFont,
        fontWeight = FontWeight.Normal,
        fontSize = 8.sp,
        lineHeight = 12.sp,
        letterSpacing = 0.4.sp
    )
)