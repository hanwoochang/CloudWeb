import React from 'react';

export default function AppComponent() {
  return (
    <div>
      <Warn text="hello!!!!" />
      <Warn text="hello!!!!" prefix="[긴급]" />
      <Warn text="hello!!!!" prefix="[new]" size="50px" />
    </div>
  );
}

function Warn({ text, prefix = '경고', size = '20px'}) {
  return (
    <div style={{ color: 'red', fontSize: size }}>
      {prefix} : {text}
    </div>
  );
}