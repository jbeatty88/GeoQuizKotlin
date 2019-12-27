package com.bignerdranch.android.geoquizkotlin

import androidx.annotation.StringRes

data class Question(@StringRes val textResId: Int, val answer: Boolean)