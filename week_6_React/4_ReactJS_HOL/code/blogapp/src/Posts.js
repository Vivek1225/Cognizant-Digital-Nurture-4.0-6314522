import { Component } from 'react';

class Post {
    constructor(id, title, body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }
}

class Posts extends Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: [],
            hasError: false
        };
    }

    loadPosts() {
        fetch('https://jsonplaceholder.typicode.com/posts')
            .then(response => response.json())
            .then(data => {
                const posts = data.map(post => new Post(post.id, post.title, post.body));
                this.setState({ posts });
            })
            .catch(error => {
                console.error('Error fetching posts:', error);
                this.setState({ hasError: true });
            });
    }

    componentDidMount() {
        this.loadPosts();
    }

    componentDidCatch(error, info) {
        console.error('Error in component:', error, info);
        alert(`An error occurred: ${error.message}`);
        this.setState({ hasError: true });
    }

    render() {
        return (
            <div className="posts-container">
                <h1>Blog Posts</h1>
                {this.state.posts.length === 0 ? (
                    <p>Loading posts...</p>
                ) : (
                    this.state.posts.map(post => (
                        <div key={post.id} className="post">
                            <h2>{post.title}</h2>
                            <p>{post.body}</p>
                        </div>
                    ))
                )}
            </div>
        );
    }
}

export default Posts;