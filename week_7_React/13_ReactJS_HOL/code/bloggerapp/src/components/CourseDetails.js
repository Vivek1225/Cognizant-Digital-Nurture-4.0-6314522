// src/components/CourseDetails.js
import React from 'react';

function CourseDetails({ course }) {
  const hasCourse = course && course.title;
  
  return (
    <div>
      <h2>Course Details</h2>
      {hasCourse && (
        <>
          <p><strong>Title:</strong> {course.title}</p>
          <p><strong>Instructor:</strong> {course.instructor}</p>
          <p><strong>Duration:</strong> {course.duration}</p>
        </>
      )}
      {!hasCourse && <div>No course selected</div>}
    </div>
  );
}

export default CourseDetails;