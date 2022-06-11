package framework_test.Api_spot;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class ApiTests {
    String token = "BQAxjlQTjqLHI-shGo0bwgBOh6mvJ50qT2bYjGBaauEfjiPk5mE0uZNseP7p5EvapHWfM6tjxxvZXNencZmKUVJjXkbiq9KgXwzTZQDLc7LM31H1B9_yxY6vWyrJUg0UkIwGWSEsWFbL_YBtR_hbMeTzrE3KTMkNxvx1lVxVtlBVtv3HjqTuIDuCADbP8F33O1Xc-nmqC5OYYv9tRMNyewyMZyjw9sUpMQqBI34QRAxs0g";
    String id = "313nt5yp3d6mho5ebdrm33q7xc4q";
    String playlist_id = "7MajkgybsAEZnRQLaGPy1u";

    @Test
    public void startTest() {

        // 1 Get_Artist
        given()
                .when().contentType("application/json")
                .header("Authorization", "Bearer " + token)
                .get("https://api.spotify.com/v1/artists/5meD8C7oGK5yUEY2T7ZZ7W")
                .then()
                .assertThat()
                .statusCode(200);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 2 Get_Artist_Top_Tracks
        given()
                .when().contentType("application/json")
                .header("Authorization", "Bearer " + token)
                .get("https://api.spotify.com/v1/artists/5meD8C7oGK5yUEY2T7ZZ7W/top-tracks?market=UA")
                .then()
                .assertThat()
                .statusCode(200);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 3 Get Album
        given()
                .when().contentType("application/json")
                .header("Authorization", "Bearer " + token)
                .get("https://api.spotify.com/v1/albums/1P6SeYoLzFyj0tBhSxK3t1?market=UA")
                .then()
                .assertThat()
                .statusCode(200);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 4 Get playlist
        given().when()
                .header("Authorization", "Bearer " + token)
                .get("\thttps://api.spotify.com/v1/playlists/" + playlist_id)
                .then()
                .assertThat()
                .statusCode(200);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 5 Update playlist
        Response update = given().body("{\n" +
                        "  \"name\": \"Updated Playlist Name\",\n" +
                        "  \"description\": \"Updated playlist description\",\n" +
                        "  \"public\": false\n" +
                        "}")
                .when().contentType("application/json")
                .header("Authorization", "Bearer " + token)
                .put("\thttps://api.spotify.com/v1/playlists/" + playlist_id);

        update
                .then()
                .assertThat()
                .statusCode(200);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

/*
        // 4 Create playlist
        Response post = given().body("{\n" +
                        "  \"name\": \"New Test1 Playlist\",\n" +
                        "  \"description\": \"New playlist description\",\n" +
                        "  \"public\": false\n" +
                        "}")
                .when().contentType("application/json")
                .header("Authorization", "Bearer " + token)
                .post("\thttps://api.spotify.com/v1/users/313nt5yp3d6mho5ebdrm33q7xc4q/playlists" + id + "/playlists");

        post
                .then()
                .assertThat()
                .statusCode(201);

        ResponseBody body1 = post.getBody();
        playlist_id = body1.jsonPath().get("id");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        */
    }
}
