def fact(n)
  if n==0 
    1 
  else
    fact(n-1) * n 
  end
end

fact(1000000)