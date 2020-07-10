package com.company.sonikplams.shapeappearancemodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import com.google.android.material.shape.CornerFamily
import com.google.android.material.shape.MaterialShapeDrawable
import com.google.android.material.shape.ShapeAppearanceModel
import com.google.android.material.shape.TriangleEdgeTreatment
import kotlinx.android.synthetic.main.activity_main.*
import java.nio.file.Files.size


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radius = resources.getDimension(R.dimen.offset_8)

        val triangleEdgeTreatment = TriangleEdgeTreatment(30F, false)

        card.background = null
        card.alpha = 0.8F

        //card_view.alpha = 0.8F

        val shapeAppearanceModel = ShapeAppearanceModel()
            .toBuilder()
            .setBottomEdge(triangleEdgeTreatment)
            .setAllCorners(CornerFamily.ROUNDED, radius)
            .build()

        val shapeDrawable = MaterialShapeDrawable(shapeAppearanceModel)
        ViewCompat.setBackground(card_view, shapeDrawable)

    }
}