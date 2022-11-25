package com.tahapasha.tasarimogreniyorum

import android.os.Bundle
import android.view.View
import android.view.animation.AlphaAnimation
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

var resultante:Long =0
var resultante2:Long =0
var flag:Int = -1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private val buttonClick = AlphaAnimation(1f, 0.8f)

    fun onClickZer(v: View) {
        v.startAnimation(buttonClick)
        resultante*=10
        sonuclar.text = resultante.toString()
        buttonAC.text = "C"
        gulme.text = ""
    }
    fun onClickOne(v: View) {
        v.startAnimation(buttonClick)
        resultante*=10
        resultante+=1
        sonuclar.text = resultante.toString()
        buttonAC.text = "C"
        gulme.text = ""
    }
    fun onClickTwo(v: View) {
        v.startAnimation(buttonClick)
        resultante*=10
        resultante+=2
        sonuclar.text = resultante.toString()
        buttonAC.text = "C"
        gulme.text = ""
    }
    fun onClickThr(v: View) {
        v.startAnimation(buttonClick)
        resultante*=10
        resultante+=3
        sonuclar.text = resultante.toString()
        buttonAC.text = "C"
        gulme.text = ""
    }
    fun onClickFou(v: View) {
        v.startAnimation(buttonClick)
        resultante*=10
        resultante+=4
        sonuclar.text = resultante.toString()
        buttonAC.text = "C"
        gulme.text = ""
    }

    fun onClickFiv(v: View) {
        v.startAnimation(buttonClick)
        resultante*=10
        resultante+=5
        sonuclar.text = resultante.toString()
        buttonAC.text = "C"
        gulme.text = ""
    }
    fun onClickSix(v: View) {
        v.startAnimation(buttonClick)
        resultante*=10
        resultante+=6
        sonuclar.text = resultante.toString()
        buttonAC.text = "C"
        gulme.text = ""
    }

    fun onClickSev(v: View) {
        v.startAnimation(buttonClick)
        resultante*=10
        resultante+=7
        sonuclar.text = resultante.toString()
        buttonAC.text = "C"
        gulme.text = ""
    }
    fun onClickEig(v: View) {
        v.startAnimation(buttonClick)
        resultante*=10
        resultante+=8
        sonuclar.text = resultante.toString()
        buttonAC.text = "C"
        gulme.text = ""
    }
    fun onClickNin(v: View) {
        v.startAnimation(buttonClick)
        resultante*=10
        resultante+=9
        sonuclar.text = resultante.toString()
        buttonAC.text = "C"
        gulme.text = ""
    }
    fun onClickAC(v: View) {
        v.startAnimation(buttonClick)
        resultante=0
        resultante2=0
        sonuclar.text = ""
        sonuclar2.text=""
        buttonAC.text = "AC"
        flag = -1
        gulme.text = ""

    }
    fun onClickSign(v: View) {
        v.startAnimation(buttonClick)
        resultante*=-1
        sonuclar.text = resultante.toString()
        gulme.text = ""
    }
    fun onClickDivide(v: View) {
        v.startAnimation(buttonClick)
        resultante2= resultante
        resultante=0
        sonuclar.text = ""
        sonuclar2.text = resultante2.toString()
        flag =0

    }
    fun onClickMultiply(v: View) {
        v.startAnimation(buttonClick)
        resultante2= resultante
        resultante=0
        sonuclar.text = ""

        sonuclar2.text = resultante2.toString()
        flag = 1
    }
    fun onClickSubtract(v: View) {
        v.startAnimation(buttonClick)
        resultante2= resultante
        resultante=0
        sonuclar.text = ""
        sonuclar2.text = resultante2.toString()
        flag = 2
    }
    fun onClickAdd(v: View) {
        v.startAnimation(buttonClick)
        resultante2= resultante
        resultante=0
        sonuclar.text = ""
        sonuclar2.text = resultante2.toString()
        flag = 3
    }
    fun onClickEqual(v: View) {
        v.startAnimation(buttonClick)
        if(flag == 0)
        {
            if (resultante== 0L)
            {
                resultante =0
                resultante2 =0
                sonuclar2.text = ""
                sonuclar.text = "ERR"
                return
            }
            sonuclar2.text = ""
            resultante2/=resultante
            sonuclar.text = resultante2.toString()
            resultante = resultante2
            resultante2 =0
            if(resultante == 31L)
            {
                gulme.text = "SJDHSDŞKFJHSD"
            }
        }
        else if(flag == 1)
        {
            sonuclar2.text = ""
            resultante2*=resultante
            sonuclar.text = resultante2.toString()
            resultante = resultante2
            resultante2 =0
            if(resultante == 31L)
            {
                gulme.text = "SJDHSDŞKFJHSD"
            }
        }
        else if(flag == 2)
        {
            sonuclar2.text = ""
            resultante2-=resultante
            sonuclar.text = resultante2.toString()
            resultante = resultante2
            resultante2 =0
            if(resultante == 31L)
            {
                gulme.text = "SJDHSDŞKFJHSD"
            }
        }
        else if(flag == 3)
        {
            sonuclar2.text = ""
            resultante2+=resultante
            sonuclar.text = resultante2.toString()
            resultante = resultante2
            resultante2 =0
            if(resultante == 31L)
            {
                gulme.text = "SJDHSDŞKFJHSD"
            }
        }
    }


}