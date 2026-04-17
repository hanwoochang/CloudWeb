import React from 'react';
import { useState } from 'react';

export default function AppState() {
  const [count, setCount] = useState(0);

  return (
    <div>
      <div>현재값 : {count} </div>
      <button onClick={() => setCount(count + 1)}>증가</button>
      <button onClick={() => setCount(count - 1)}>감소</button>
    </div>
  );
}