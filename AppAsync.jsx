import React, { useState, useEffect } from 'react';
import axios from 'axios';

export default function AppAsync() {
  const [todos, setTodos] = useState([]);
  async function init() {
    try {
        const response = await axios.get('https://jsonplaceholder.typicode.com/todos')
        setTodos(response.data)
    } catch (error) {  console.log(error)}
  }

  useEffect(() => {
    init()    
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
