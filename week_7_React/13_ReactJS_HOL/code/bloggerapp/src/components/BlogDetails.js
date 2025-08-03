// src/components/BlogDetails.js
import React from 'react';

function BlogDetails({ blog }) {
  return blog ? (
    <div>
      <h2>Blog Details</h2>
      <p><strong>Title:</strong> {blog.title}</p>
      <p><strong>Author:</strong> {blog.author}</p>
      <p><strong>Content:</strong> {blog.content}</p>
    </div>
  ) : (
    <div>No blog selected</div>
  );
}

export default BlogDetails;