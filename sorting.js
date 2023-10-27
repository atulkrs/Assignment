const arr1 = [24.6,23.7,18.9,76.5];  
  
function arrSort(arr) { 
    arr.sort((a,b)=>a-b); 
    arr.reverse(); 
    return arr; 
} 
  
console.log(arrSort(arr1)); 