import React, { useState, useEffect } from 'react';
import axios from 'axios';

export default function AppPromise() {
  const [todos, setTodos] = useState([]);

  useEffect(() => {
    axios
      .get('https://jsonplaceholder.typicode.com/todos')
      .then((response) => setTodos(response.data))
      .catch(console.log);
  }, []);

  return (
    <div>
      {todos.map((todo) => (
        <div>
          {todo.completed ? '[X]' : '[ ]'}
          {todo.title}
        </div>
      ))}
    </div>
  );
}
