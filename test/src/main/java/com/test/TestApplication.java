package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {

		@PostMapping
    public ResponseEntity<Post> savePost(
            @RequestBody Post post
    ) {
        Post newPost = postService.savePost(post);
        return new ResponseEntity<>(newPost, HttpStatus.CREATED);
    }


    @GetMapping("/{postId}")
    public ResponseEntity<?> getPostById(@PathVariable String postId) {
        Post post = postService.findPostById(postId);

        if (post == null) {
            return new ResponseEntity<>("Post not found with ID: " + postId, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(post, HttpStatus.OK);
    }

                 
                int=100;
		SpringApplication.run(TestApplication.class, args);
	}

}
