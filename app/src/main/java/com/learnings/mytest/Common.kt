package com.learnings.mytest

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.learnings.mytest.models.ModelData
import com.learnings.mytest.ui.theme.primaryLight

@Composable
@Preview
fun MainToolBarPreview(modifier: Modifier = Modifier) {
    MainToolBar(title = "Demo Toolbar", { })
}



@Composable
fun MainToolBar(title: String, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .padding(horizontal = 20.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Card(
            modifier = Modifier
                .size(40.dp)
                .clickable {
                    onClick.invoke()
                }, colors = CardDefaults.cardColors(
                contentColor = primaryLight
            ), shape = RoundedCornerShape(100)
        ) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Icon(
                    painterResource(id = R.drawable.ic_back1),
                    contentDescription = null,
                    tint = Color.White,
                )
            }
        }


        Text(
            text = title, style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
            ), color = Color.White, modifier = Modifier.padding(start = 32.dp)
        )
    }
}


fun getList(): List<ModelData> {

    return listOf(
        ModelData(
            title = "LOVE",
            listOf(
                "Love is the light that dissolves all walls between souls, families, and nations.",
                "True love stories never have endings. They are always beginning, always blooming, always growing.",
                "In a sea of people, my eyes will always search for you, my heart will always beat for you.",
                "Love isn't something you find. Love is something that finds you when you least expect it.",
                "You are my today and all of my tomorrows. My love for you grows with each passing day.",
                "Love is not about how many days, months, or years you have been together. It's about how much you love each other every day.",
                "I love you not because of who you are, but because of who I am when I am with you.",
                "Love is composed of a single soul inhabiting two bodies, a connection that transcends all time.",
                "When I saw you I fell in love, and you smiled because you knew. Our hearts beat as one.",
                "You don't marry someone you can live with, you marry the person you cannot live without.",
                "To love and be loved is to feel the sun from both sides, warming our hearts and souls.",
                "Love is not finding someone to live with; it's finding someone you can't imagine living without.",
                "I love you for all that you are, all that you have been, and all you're yet to be.",
                "Every love story is beautiful, but ours is my favorite. I cherish every moment we share together.",
                "Love is like the wind; you can't see it, but you can feel it in every breath.",
                "Love is a friendship set to music, a symphony of hearts dancing in perfect harmony.",
                "You are the source of my joy, the center of my world, and the whole of my heart."
            )
        ),
        ModelData(
            title = "FRIENDSHIP",
            listOf(
                "A friend is one who overlooks your broken fence and admires the flowers in your garden.",
                "Friendship is the golden thread that ties the heart of all the world. It connects us deeply.",
                "A real friend is one who walks in when the rest of the world walks out. Always there.",
                "Friends are the siblings God never gave us, the family we choose for ourselves, forever cherished.",
                "Friendship is born at that moment when one person says to another, 'What! You too? I thought I was the only one.'",
                "A good friend knows all your best stories, but a best friend has lived them with you.",
                "True friends are never apart, maybe in distance but never in heart. They are always close.",
                "Friendship is not about whom you have known the longest. It's about who walked into your life, said, 'I'm here for you,' and proved it.",
                "A single rose can be my garden... a single friend, my world. Friends make everything better.",
                "Friendship isn't about whom you have known the longest. It's about who came and never left your side.",
                "Good friends are like stars. You don't always see them, but you know they're always there.",
                "The most beautiful discovery true friends make is that they can grow separately without growing apart.",
                "Friendship is the only cement that will ever hold the world together. It is the bond we share.",
                "Friends are the family you choose. They are the ones who understand your silence and your words.",
                "A friend is someone who gives you total freedom to be yourself. They accept you as you are.",
                "Friendship is the shadow of the evening, which strengthens with the setting sun of life.",
                "A friend to all is a friend to none. Cherish those who stand by you in all times."
            )
        ),
        ModelData(
            title = "HOBBIES",
            listOf(
                "Reading is to the mind what exercise is to the body. It keeps us vibrant and alive.",
                "Playing guitar soothes the soul and brings music to life. Every strum tells a story.",
                "Painting is silent poetry, and poetry is painting that speaks. It expresses the unspoken emotions.",
                "Gardening adds years to your life and life to your years. It is a dance with nature.",
                "Cooking is love made visible. Every dish is a story, a blend of flavors and passion.",
                "Cycling is the closest you can get to flying. It is freedom, adventure, and joy on wheels.",
                "Photography captures moments otherwise lost, a click that freezes time, memories etched in pixels.",
                "Hiking connects you with nature, one step at a time. Every trail tells a story of adventure.",
                "Fishing is not just a sport; it's a way to connect with nature and find inner peace.",
                "Traveling leaves you speechless, then turns you into a storyteller. Every journey is a new chapter.",
                "Knitting is a journey of loops and stitches, a creative expression of patience and skill.",
                "Dancing is like dreaming with your feet. It is an expression of joy, freedom, and movement.",
                "Writing is the painting of the voice. It brings words to life, creating worlds within pages.",
                "Bird watching opens your eyes to the beauty of nature, a silent observance of wings in flight.",
                "Astronomy is a journey to the stars. It is looking up and understanding our place in the universe.",
                "Collecting stamps is like traveling the world without leaving home. Each stamp tells a story of history.",
                "Woodworking is the art of shaping wood into pieces of beauty and utility. It is craftsmanship at its finest."
            )
        ),
        ModelData(
            title = "SPORTS",
            listOf(
                "Soccer is not just a game; it is a passion that unites hearts and nations.",
                "Basketball is life in 94 feet, where every dribble and dunk tells a story of dedication.",
                "Tennis is a dance of speed, precision, and strategy. Every match is a test of will.",
                "Baseball is the heart of America, a timeless tradition where every pitch counts.",
                "Cricket is a gentleman's game, a blend of skill, strategy, and patience on the field.",
                "Swimming is a dance with water, a fluid motion of strength and grace.",
                "Running is not about being better than someone else; it's about being better than you used to be.",
                "Cycling is the open road and the wind in your face, a journey of endurance and freedom.",
                "Badminton is a game of speed and agility, where reflexes and precision are key.",
                "Golf is a walk in the park with a purpose. It is a test of skill and patience.",
                "Boxing is more than a fight; it is a test of strength, endurance, and spirit.",
                "Wrestling is the oldest sport, a test of strength, technique, and determination.",
                "Skating is flying on the ground, a dance of balance and grace on wheels or blades.",
                "Skiing is the thrill of the downhill, a blend of speed, control, and the beauty of snow.",
                "Surfing is riding the waves, a connection with the ocean and its ever-changing moods.",
                "Volleyball is teamwork and strategy, a game of spikes and saves, played with heart.",
                "Rugby is the sport of strength and speed, a game of strategy and unyielding spirit."
            )
        ),
        ModelData(
            title = "MUSIC",
            listOf(
                "Rock music is rebellion and freedom, a loud and powerful expression of emotion.",
                "Pop music is the soundtrack of our lives, catchy tunes that stay with us forever.",
                "Jazz is the sound of surprise, a spontaneous and soulful expression of the moment.",
                "Classical music is timeless beauty, compositions that have transcended centuries and continue to inspire.",
                "Hip-hop is the voice of the streets, a powerful and rhythmic expression of life and culture.",
                "Country music tells stories of life and love, simple melodies with heartfelt lyrics.",
                "Blues is the sound of sorrow and joy, a musical journey through the highs and lows of life.",
                "Electronic music is the beat of the future, a blend of technology and creativity.",
                "Reggae is the rhythm of the islands, a laid-back and soulful expression of life.",
                "Folk music is the voice of the people, stories and traditions passed down through generations.",
                "Metal is the sound of intensity, powerful and aggressive, a raw expression of emotion.",
                "R&B is smooth and soulful, a blend of rhythm and blues that touches the heart.",
                "Soul music is the sound of emotion, a powerful and heartfelt expression of the human experience.",
                "Punk is the sound of rebellion, fast and loud, a defiant expression of individuality.",
                "Opera is drama and music combined, a powerful and emotional performance that tells a story.",
                "Disco is the sound of the dance floor, upbeat and infectious, a celebration of life.",
                "Gospel music is the sound of faith, powerful and uplifting, a celebration of the divine."
            )
        )

    )
}