package cn.edu.bistu.cs.se.caculators;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Happy.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Happy#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Happy extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    double num1 = 0, num2 = 0;
    int op = 0;
    double result = 0;
    boolean isClickEqu = false;

    private OnFragmentInteractionListener mListener;

    public Happy() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Happy.
     */
    // TODO: Rename and change types and number of parameters
    public static Happy newInstance(String param1, String param2) {
        Happy fragment = new Happy();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_happy, container, false);
        Button btn_Back=(Button) view.findViewById(R.id.btnBack);
        Button btn_c = (Button) view.findViewById(R.id.btn_c);
        Button btn_add = (Button) view.findViewById(R.id.btn_add);
        Button btn_sin = (Button) view.findViewById(R.id.btn_sin);
        Button btn_cos = (Button) view.findViewById(R.id.btn_cos);
        Button btn_tan = (Button) view.findViewById(R.id.btn_tan);
        Button btn_sub = (Button) view.findViewById(R.id.btn_sub);
        Button btn_1 = (Button) view.findViewById(R.id.btn_1);
        Button btn_2 = (Button) view.findViewById(R.id.btn_2);
        Button btn_3 = (Button) view.findViewById(R.id.btn_3);
        Button btn_4 = (Button) view.findViewById(R.id.btn_4);
        Button btn_5 = (Button) view.findViewById(R.id.btn_5);
        Button btn_6 = (Button) view.findViewById(R.id.btn_6);
        Button btn_7 = (Button) view.findViewById(R.id.btn_7);
        Button btn_8 = (Button) view.findViewById(R.id.btn_8);
        Button btn_9 = (Button) view.findViewById(R.id.btn_9);
        Button btn_0 = (Button) view.findViewById(R.id.btn_0);
        Button btn_mul = (Button) view.findViewById(R.id.btn_mul);
        Button btn_xx = (Button) view.findViewById(R.id.btn_xx);
        Button btn__ = (Button) view.findViewById(R.id.btn__);
        Button btn_div = (Button) view.findViewById(R.id.btn_div);
        Button btn_equ = (Button) view.findViewById(R.id.btn_equ);
        final EditText resultText = (EditText)view.findViewById(R.id.editText);
//按键0
       btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClickEqu) {
                    resultText.setText(null);
                    isClickEqu = false;
                }
                String myString = resultText.getText().toString();
                resultText.setText(myString.substring(0, myString.length()-1));
            }
        });
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClickEqu) {
                    resultText.setText(null);
                    isClickEqu = false;
                }
                String myString = resultText.getText().toString();
                myString += "0";
                resultText.setText(myString);
            }
        });
        //按键1
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClickEqu) {
                    resultText.setText(null);
                    isClickEqu = false;
                }
                String myString1 = resultText.getText().toString();
                myString1="1";
                resultText.setText(myString1);
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClickEqu) {
                    resultText.setText(null);
                    isClickEqu = false;
                }
                String myString2 = resultText.getText().toString();
                myString2 += "2";
                resultText.setText(myString2);
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClickEqu) {
                    resultText.setText(null);
                    isClickEqu = false;
                }
                String myString3 = resultText.getText().toString();
                myString3 += "3";
                resultText.setText(myString3);
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClickEqu) {
                    resultText.setText(null);
                    isClickEqu = false;
                }
                String myString4 = resultText.getText().toString();
                myString4 += "4";
                resultText.setText(myString4);
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClickEqu) {
                    resultText.setText(null);
                    isClickEqu = false;
                }
                String myString5 = resultText.getText().toString();
                myString5 += "5";
                resultText.setText(myString5);
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClickEqu) {
                    resultText.setText(null);
                    isClickEqu = false;
                }
                String myString6 = resultText.getText().toString();
                myString6 += "6";
                resultText.setText(myString6);
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClickEqu) {
                    resultText.setText(null);
                    isClickEqu = false;
                }
                String myString7 = resultText.getText().toString();
                myString7 += "7";
                resultText.setText(myString7);
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClickEqu) {
                    resultText.setText(null);
                    isClickEqu = false;
                }
                String myString8 = resultText.getText().toString();
                myString8 += "8";
                resultText.setText(myString8);
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClickEqu) {
                    resultText.setText(null);
                    isClickEqu = false;
                }
                String myString9 = resultText.getText().toString();
                myString9 += "9";
                resultText.setText(myString9);
            }
        });
        //小数点
        btn__.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (isClickEqu) {
                        resultText.setText(null);
                        isClickEqu = false;
                    }
                    String myString_ = resultText.getText().toString();
                    myString_ += ".";
                    resultText.setText(myString_);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        //加号
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String myStringAdd = resultText.getText().toString();
                    if (myStringAdd.equals(null)) {
                        return;
                    }
                    num1 = Double.valueOf(myStringAdd);
                    resultText.setText(null);
                    op = 1;
                    isClickEqu = false;
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        //清零
        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.setText(null);
            }
        });
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String myStringSub = resultText.getText().toString();
                    if (myStringSub.equals(null)) {
                        return;
                    }
                    num1 = Double.valueOf(myStringSub);
                    resultText.setText(null);
                    op = 2;
                    isClickEqu = false;
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        //乘
        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String myStringMul = resultText.getText().toString();
                    if (myStringMul.equals(null)) {
                        return;
                    }
                    num1 = Double.valueOf(myStringMul);
                    resultText.setText(null);
                    op = 3;
                    isClickEqu = false;
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        //除号
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String myStringDiv = resultText.getText().toString();
                    if (myStringDiv.equals(null)) {
                        return;
                    }
                    num1 = Double.valueOf(myStringDiv);
                    resultText.setText(null);
                    op = 4;
                    isClickEqu = false;
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        //sin值
        btn_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String myStringSin = resultText.getText().toString();
                    if (myStringSin.equals(null)) {
                        return;
                    } else {
                        num1 = Double.valueOf(myStringSin);
                        resultText.setText(String.valueOf(num1));
                        op = 5;
                        isClickEqu = false;
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        //cos值
        btn_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String myStringCos = resultText.getText().toString();
                    if (myStringCos.equals(null)) {
                        return;
                    }
                    num1 = Double.valueOf(myStringCos);
                    resultText.setText(String.valueOf(num1));
                    op = 6;
                    isClickEqu = false;
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });

        //tan值
        btn_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String myStringTan = resultText.getText().toString();
                    if (myStringTan.equals(null)) {
                        return;
                    }
                    num1 = Double.valueOf(myStringTan);
                    resultText.setText(String.valueOf(num1));
                    op = 7;
                    isClickEqu = false;
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });

        //等于
        btn_equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String myStringEqu = resultText.getText().toString();
                    if (myStringEqu.equals(null)) {
                        return;
                    }
                    if (isClickEqu == false) {
                        num2 = Double.valueOf(myStringEqu);
                        resultText.setText(null);
                        switch (op) {
                            case 0:
                                result = num2;
                                break;
                            case 1:
                                result = num1 + num2;
                                break;
                            case 2:
                                result = num1 - num2;
                                break;
                            case 3:
                                result = num1 * num2;
                                break;
                            case 4:
                                result = num1 / num2;
                                break;
                            case 5:
                                result = Math.sin(Math.PI * (num2 / 180));
                                break;
                            case 6:
                                result = Math.cos(Math.PI * (num2 / 180));
                                break;
                            case 7:
                                result = Math.tan(Math.PI * (num2 / 180));
                                break;
                            default:
                                result = 0;
                                break;
                        }
                    } else {
                        num1 = Double.valueOf(myStringEqu);
                        resultText.setText(null);
                        switch (op) {
                            case 0:
                                result = num1;
                                break;
                            case 1:
                                result = num1 + num2;
                                break;
                            case 2:
                                result = num1 - num2;
                                break;
                            case 3:
                                result = num1 * num2;
                                break;
                            case 4:
                                result = num1 / num2;
                                break;
                            default:
                                result = 0;
                                break;
                        }
                    }
                    resultText.setText(String.valueOf(result));
                    isClickEqu = true;
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        //平方
        btn_xx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String myStringxx = resultText.getText().toString();
                    if (myStringxx.equals(null)) {
                        return;
                    } else {
                        num1 = Double.valueOf(myStringxx);
                        resultText.setText(String.valueOf(num1 * num1));
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
