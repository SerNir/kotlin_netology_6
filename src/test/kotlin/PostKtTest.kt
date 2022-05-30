import org.junit.Test

import org.junit.Assert.*

class PostKtTest {

    @Test
    fun addPostTest() {
        val post0 = Post(0, 1, 1, 23052022, "FIRST POST", Comments(), "", 212, Repost(), 212, "post")
        val posts = WallService
        val postTest = posts.addPost(post0)

        assertNotEquals(0, postTest.id)
    }

    @Test
    fun updatePostFromIdTrue() {
        val post0 = Post(0, 1, 1, 23052022, "FIRST POST", Comments(), null, 212, Repost(), 212, "post")
        val post1 = Post(0, 1, 1, 23052022, "Second POST", Comments(), null, 212, Repost(), 212, "post")
        val post2 = Post(0, 1, 1, 23052022, "FIRST POST", Comments(), "murzilka", 212, Repost(), 212, "post", 4)
        val post3 = Post(0, 1, 1, 23052022, "FIRST POST", Comments(), null, 212, Repost(), 212, "post")

        val posts = WallService
        posts.addPost(post0)
        posts.addPost(post1)
        println(posts.addPost(post2))
        posts.addPost(post3)

        val post4 = Post(4, 2, 2, 24052022, "Update Post", Comments(), "2000", 454, Repost(), 4525, "update")
        println(posts.updatePost(post4))
    }

    @Test
    fun updatePostFromIdFalse() {
        val post0 = Post(0, 1, 1, 23052022, "FIRST POST", Comments(), null, 212, Repost(), 212, "post")
        val post1 = Post(0, 1, 1, 23052022, "Second POST", Comments(), "2000", 212, Repost(12), 212, "post")
        val post2 = Post(0, 1, 1, 23052022, "FIRST POST", Comments(3), null, 212, Repost(), 212, "post", 4)
        val post3 = Post(0, 1, 1, 23052022, "FIRST POST", Comments(), null, 212, Repost(), 212, "post")

        val posts = WallService
        posts.addPost(post0)
        posts.addPost(post1)
        println(posts.addPost(post2))
        posts.addPost(post3)

        val post4 = Post(0, 2, 2, 24052022, "Update Post", Comments(), "2000", 454, Repost(), 4525, "update")
        println(posts.updatePost(post4))
    }
}