// src/App.js
import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';
import './App.css';

function App() {
  const [activeTab, setActiveTab] = useState('book');
  const [showDetails, setShowDetails] = useState(false);

  const bookData = {
    title: 'React Essentials',
    author: 'John Doe',
    year: 2023
  };

  const blogData = {
    title: 'Learning React',
    author: 'Jane Smith',
    content: 'React is a powerful JavaScript library for building user interfaces.'
  };

  const courseData = {
    title: 'Advanced React',
    instructor: 'Mike Johnson',
    duration: '8 weeks'
  };

  let content;
  if (activeTab === 'book') {
    content = <BookDetails book={showDetails ? bookData : null} />;
  } else if (activeTab === 'blog') {
    content = <BlogDetails blog={showDetails ? blogData : null} />;
  } else {
    content = <CourseDetails course={showDetails ? courseData : null} />;
  }

  return (
    <div className="App">
      <h1>Blogger App</h1>
      
      <div className="tabs">
        <button onClick={() => setActiveTab('book')}>Book</button>
        <button onClick={() => setActiveTab('blog')}>Blog</button>
        <button onClick={() => setActiveTab('course')}>Course</button>
      </div>

      <button onClick={() => setShowDetails(!showDetails)}>
        {showDetails ? 'Hide Details' : 'Show Details'}
      </button>

      {showDetails ? (
        <div className="details-container">
          {content}
        </div>
      ) : (
        <p>Click "Show Details" to view information</p>
      )}

      {activeTab === 'book' && <p className="hint">This section displays book information</p>}
      {activeTab === 'blog' && <p className="hint">This section displays blog posts</p>}
      {activeTab === 'course' && <p className="hint">This section displays course details</p>}

      {/* Updated horizontal layout for all components */}
      <div className="all-components">
        <h3>All Components Rendered Together</h3>
        <div className="components-row">
          <div className="component-card">
            <BookDetails book={bookData} />
          </div>
          <div className="component-card">
            <BlogDetails blog={blogData} />
          </div>
          <div className="component-card">
            <CourseDetails course={courseData} />
          </div>
        </div>
      </div>
    </div>
  );
}

export default App;