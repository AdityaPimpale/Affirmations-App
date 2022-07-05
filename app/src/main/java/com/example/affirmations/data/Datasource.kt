package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {

    fun loadAffirmations(): List<Affirmation>{
        return listOf<Affirmation>(Affirmation(R.string.affirmations1,R.drawable.image1),
            Affirmation(R.string.affirmations2,R.drawable.image2),
            Affirmation(R.string.affirmations3,R.drawable.image3),
            Affirmation(R.string.affirmations4,R.drawable.image4),
            Affirmation(R.string.affirmations5,R.drawable.image5),
            Affirmation(R.string.affirmations6,R.drawable.image6),
            Affirmation(R.string.affirmations7,R.drawable.image7),
            Affirmation(R.string.affirmations8,R.drawable.image8),
            Affirmation(R.string.affirmations9,R.drawable.image9),
            Affirmation(R.string.affirmations10,R.drawable.image10)
        )
    }
}