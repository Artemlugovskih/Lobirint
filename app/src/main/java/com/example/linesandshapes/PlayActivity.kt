package com.example.linesandshapes

import android.graphics.Point
import android.graphics.Rect
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PlayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)
     val image:ImageView=findViewById(R.id.uS)
    val imageUp:ImageView=findViewById(R.id.ifUp)
        val imageDown:ImageView=findViewById(R.id.ifDown)
        val imageLeft:ImageView=findViewById(R.id.ifLeft)
        val imageRight:ImageView=findViewById(R.id.ifRight)
        imageUp.setOnClickListener {
//            (image.layoutParams as ViewGroup.MarginLayoutParams).topMargin -= 10
//            image.requestLayout()
            if(!image.isOverlap(findViewById(R.id.view))&& !image.isOverlap(findViewById(R.id.view2))
                && !image.isOverlap(findViewById(R.id.view3))
                && !image.isOverlap(findViewById(R.id.view4))
                && !image.isOverlap(findViewById(R.id.view5))
                && !image.isOverlap(findViewById(R.id.view6))
                && !image.isOverlap(findViewById(R.id.view7))
                && !image.isOverlap(findViewById(R.id.view8))
                && !image.isOverlap(findViewById(R.id.view9))
                && !image.isOverlap(findViewById(R.id.view10))
                && !image.isOverlap(findViewById(R.id.view11))
                && !image.isOverlap(findViewById(R.id.view12))
                && !image.isOverlap(findViewById(R.id.view13))

                && !image.isOverlap(findViewById(R.id.view15))
                && !image.isOverlap(findViewById(R.id.view16))
                && !image.isOverlap(findViewById(R.id.view17))
                && !image.isOverlap(findViewById(R.id.view18))
                && !image.isOverlap(findViewById(R.id.view21))
                && !image.isOverlap(findViewById(R.id.view22))
                && !image.isOverlap(findViewById(R.id.view23))
                && !image.isOverlap(findViewById(R.id.view24))
                && !image.isOverlap(findViewById(R.id.view27))
                && !image.isOverlap(findViewById(R.id.view35))
                && !image.isOverlap(findViewById(R.id.view41))
                && !image.isOverlap(findViewById(R.id.view42))
                && !image.isOverlap(findViewById(R.id.view43))
                && !image.isOverlap(findViewById(R.id.view44))
                && !image.isOverlap(findViewById(R.id.view45))
                && !image.isOverlap(findViewById(R.id.view46))
                && !image.isOverlap(findViewById(R.id.view47))
                && !image.isOverlap(findViewById(R.id.view48))
                && !image.isOverlap(findViewById(R.id.view49))
                && !image.isOverlap(findViewById(R.id.view50))
                && !image.isOverlap(findViewById(R.id.view51))
                && !image.isOverlap(findViewById(R.id.view54))
                && !image.isOverlap(findViewById(R.id.view63))
                && !image.isOverlap(findViewById(R.id.view64))
                && !image.isOverlap(findViewById(R.id.view65))
                && !image.isOverlap(findViewById(R.id.view68))
                && !image.isOverlap(findViewById(R.id.view70))
                && !image.isOverlap(findViewById(R.id.view72))
                && !image.isOverlap(findViewById(R.id.view73))
                && !image.isOverlap(findViewById(R.id.view76))
                && !image.isOverlap(findViewById(R.id.view78))
                && !image.isOverlap(findViewById(R.id.view79))
                && !image.isOverlap(findViewById(R.id.view81))
                && !image.isOverlap(findViewById(R.id.view82))
                && !image.isOverlap(findViewById(R.id.view83))
                && !image.isOverlap(findViewById(R.id.view85))
                && !image.isOverlap(findViewById(R.id.view86))
                && !image.isOverlap(findViewById(R.id.view87))
                && !image.isOverlap(findViewById(R.id.view88))
               )
                image.y -= 20
        }
        imageDown.setOnClickListener {
            if(!image.isOverlap(findViewById(R.id.view))&&!image.isOverlap(findViewById(R.id.view3))
                && !image.isOverlap(findViewById(R.id.view4))
                && !image.isOverlap(findViewById(R.id.view5))
                && !image.isOverlap(findViewById(R.id.view6))
                && !image.isOverlap(findViewById(R.id.view7))
                && !image.isOverlap(findViewById(R.id.view8))
                && !image.isOverlap(findViewById(R.id.view9))
                && !image.isOverlap(findViewById(R.id.view10))
                && !image.isOverlap(findViewById(R.id.view11))
                && !image.isOverlap(findViewById(R.id.view12))
                && !image.isOverlap(findViewById(R.id.view13))
                && !image.isOverlap(findViewById(R.id.view15))
                && !image.isOverlap(findViewById(R.id.view16))
                && !image.isOverlap(findViewById(R.id.view17))
                && !image.isOverlap(findViewById(R.id.view18))
                && !image.isOverlap(findViewById(R.id.view21))
                && !image.isOverlap(findViewById(R.id.view22))
                && !image.isOverlap(findViewById(R.id.view23))
                && !image.isOverlap(findViewById(R.id.view24))
                && !image.isOverlap(findViewById(R.id.view27))
                && !image.isOverlap(findViewById(R.id.view35))
                && !image.isOverlap(findViewById(R.id.view41))
                && !image.isOverlap(findViewById(R.id.view42))
                && !image.isOverlap(findViewById(R.id.view43))
                && !image.isOverlap(findViewById(R.id.view44))
                && !image.isOverlap(findViewById(R.id.view45))
                && !image.isOverlap(findViewById(R.id.view46))
                && !image.isOverlap(findViewById(R.id.view47))
                && !image.isOverlap(findViewById(R.id.view48))
                && !image.isOverlap(findViewById(R.id.view49))
                && !image.isOverlap(findViewById(R.id.view50))
                && !image.isOverlap(findViewById(R.id.view51))
                && !image.isOverlap(findViewById(R.id.view54))
                && !image.isOverlap(findViewById(R.id.view63))
                && !image.isOverlap(findViewById(R.id.view64))
                && !image.isOverlap(findViewById(R.id.view65))
                && !image.isOverlap(findViewById(R.id.view68))
                && !image.isOverlap(findViewById(R.id.view70))
                && !image.isOverlap(findViewById(R.id.view72))
                && !image.isOverlap(findViewById(R.id.view73))

                && !image.isOverlap(findViewById(R.id.view76))
                && !image.isOverlap(findViewById(R.id.view79))
                && !image.isOverlap(findViewById(R.id.view81))
                && !image.isOverlap(findViewById(R.id.view82))
                && !image.isOverlap(findViewById(R.id.view83))
                && !image.isOverlap(findViewById(R.id.view85))
                && !image.isOverlap(findViewById(R.id.view86))
                && !image.isOverlap(findViewById(R.id.view87))
                && !image.isOverlap(findViewById(R.id.view88))
            )
            image.y += 20

        }
        imageLeft.setOnClickListener {
            if(!image.isOverlap(findViewById(R.id.view))
                && !image.isOverlap(findViewById(R.id.view14))
                && !image.isOverlap(findViewById(R.id.view10))
                && !image.isOverlap(findViewById(R.id.view19))
                && !image.isOverlap(findViewById(R.id.view20))

                && !image.isOverlap(findViewById(R.id.view26))
                && !image.isOverlap(findViewById(R.id.view28))
                && !image.isOverlap(findViewById(R.id.view30))
                && !image.isOverlap(findViewById(R.id.view31))
                && !image.isOverlap(findViewById(R.id.view32))
                && !image.isOverlap(findViewById(R.id.view36))
                && !image.isOverlap(findViewById(R.id.view37))
                && !image.isOverlap(findViewById(R.id.view38))
                && !image.isOverlap(findViewById(R.id.view39))
                && !image.isOverlap(findViewById(R.id.view40))

                && !image.isOverlap(findViewById(R.id.view52))
                && !image.isOverlap(findViewById(R.id.view53))
                && !image.isOverlap(findViewById(R.id.view55))
                && !image.isOverlap(findViewById(R.id.view57))
                && !image.isOverlap(findViewById(R.id.view58))
                && !image.isOverlap(findViewById(R.id.view59))
                && !image.isOverlap(findViewById(R.id.view60))
                && !image.isOverlap(findViewById(R.id.view61))
                && !image.isOverlap(findViewById(R.id.view62))
                && !image.isOverlap(findViewById(R.id.view66))
                && !image.isOverlap(findViewById(R.id.view67))
                && !image.isOverlap(findViewById(R.id.view69))
                && !image.isOverlap(findViewById(R.id.view71))
                && !image.isOverlap(findViewById(R.id.view74))
                && !image.isOverlap(findViewById(R.id.view75))
                && !image.isOverlap(findViewById(R.id.view77))
                && !image.isOverlap(findViewById(R.id.view80))
                && !image.isOverlap(findViewById(R.id.view84))
                && !image.isOverlap(findViewById(R.id.view88))
                )
            image.x -= 20

        }
        imageRight.setOnClickListener {
            if(!image.isOverlap(findViewById(R.id.view))
                && !image.isOverlap(findViewById(R.id.view14))
                && !image.isOverlap(findViewById(R.id.view10))
                && !image.isOverlap(findViewById(R.id.view19))
                && !image.isOverlap(findViewById(R.id.view25))
                && !image.isOverlap(findViewById(R.id.view26))
                && !image.isOverlap(findViewById(R.id.view28))
                && !image.isOverlap(findViewById(R.id.view30))
                && !image.isOverlap(findViewById(R.id.view31))
                && !image.isOverlap(findViewById(R.id.view32))
                && !image.isOverlap(findViewById(R.id.view36))
                && !image.isOverlap(findViewById(R.id.view37))
                && !image.isOverlap(findViewById(R.id.view38))
                && !image.isOverlap(findViewById(R.id.view39))
                && !image.isOverlap(findViewById(R.id.view40))

                && !image.isOverlap(findViewById(R.id.view52))
                && !image.isOverlap(findViewById(R.id.view53))
                && !image.isOverlap(findViewById(R.id.view55))
                && !image.isOverlap(findViewById(R.id.view57))
                && !image.isOverlap(findViewById(R.id.view58))
                && !image.isOverlap(findViewById(R.id.view59))
                && !image.isOverlap(findViewById(R.id.view60))
                && !image.isOverlap(findViewById(R.id.view61))
                && !image.isOverlap(findViewById(R.id.view62))
                && !image.isOverlap(findViewById(R.id.view66))
                && !image.isOverlap(findViewById(R.id.view67))
                && !image.isOverlap(findViewById(R.id.view69))
                && !image.isOverlap(findViewById(R.id.view71))
                && !image.isOverlap(findViewById(R.id.view74))
                && !image.isOverlap(findViewById(R.id.view75))
                && !image.isOverlap(findViewById(R.id.view77))
                && !image.isOverlap(findViewById(R.id.view80))
                && !image.isOverlap(findViewById(R.id.view84))
                && !image.isOverlap(findViewById(R.id.view88))
            )
            image.x += 20
            Log.d(image.x.toString(), image.x.toString())

        }

        }

    private fun View.isOverlap(other: View, deltaX: Int = 0, deltaY: Int = 0): Boolean
    {
        val rectThis = Rect()
        this.getHitRect(rectThis)

        rectThis.offset(deltaX, deltaY) //addind delta to every side of Rect

        val rectOther = Rect()
        other.getHitRect(rectOther)

        return rectThis.intersect(rectOther)
    }

    }
