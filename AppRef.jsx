import React from 'react';
import { useState, useEffect, useRef } from 'react';

export default function AppRef() {
  const [text, setText] = useState('');
  const textUi = useRef();

  const onChange = (event) => {
    setText(event.target.value);
  };

  const handleReset = () => {
    setText('');
    textUi.current.focus();
  };

  return (
    <div>
      <input
        type="text"
        style={{ margin: 10, borderWidth: 1, borderColor: 'red' }}
        value={text}
        ref={textUi}
        onChange={(evt) => setText(evt.target.value)}
      />
      <input
        type="text"
        style={{ margin: 10, borderWidth: 1, borderColor: 'red' }}
      />
      <input
        type="text"
        style={{ margin: 10, borderWidth: 1, borderColor: 'red' }}
      />

      <button onClick={handleReset}>초기화</button>
    </div>
  );
}
